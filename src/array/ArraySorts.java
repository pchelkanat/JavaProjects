package array;

/**
 * Created by Наталья on 30.10.2016.
 */
public class ArraySorts {
    //Сортировка Пузырьком
    public static void bubbleSort(double[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    //Сортировка рекурсивным Пузырьком

    //Сортировка выборкой
    public static void selectionSort(double[] a) {
        if (a == null || a.length <= 0)
            return;
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j])
                    min = j;
            }
            if (i != min) {
                double temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    //Быстрая сортировка
    public static void qSort(double[] a, int low, int high) {
        if (low >= high) return;
        int i = low;
        int j = high;
        double x = a[i];
        while (i < j) {
            while (i < j && a[j] >= x)
                j--;
            if (i < j)
                a[i++] = a[j];
            while (i < j && a[i] < x)
                i++;
            if (i < j)
                a[j--] = a[i];
        }
        a[i] = x;
        qSort(a, low, i - 1);
        qSort(a, i + 1, high);
    }
}
