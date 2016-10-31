package array;

/**
 * Created by Наталья on 30.10.2016.
 */

public class Array {
    double[] a;

    // Конструктор нулевого массива
    public Array(int n) {
        a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
    }

    //Рандомное заполнение
    public static void randomPrintArray(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 51 - 25;
            System.out.printf(String.format("%.2f", a[i]) + " ");
        }
    }

    //Печать массива
    public static void printArray(double[] a) {
        for (int i = 0; i < a.length; i++) System.out.printf(String.format("%.2f", a[i]) + " ");
    }

    //Добавление элемента в конец массива
    public static void setToEnd(double[] a, double x) {
        a[a.length - 1] = x;
    }

    //Добавление элемента в начало массива

    //Получение индекса
    public static double getIndex(double[] a, int x) {
        if (x < a.length) {
            //System.out.print(a[x]);
            return a[x];
        } else
            throw new IllegalArgumentException("Wrong index!");
    }

    //Перестановка двух элементов
    public static void swapElements(double[] a, int x, int y) {
        double temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    //Сумма элементов
    public static double getSum(double[] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) sum += a[i];
        return sum;
    }

    //Среднее арифметическое
    public static double average(double[] a) {
        return getSum(a) / a.length;
    }

    //Поиск MAX MIN
    public static void getMaxAndMin(double a[]) {
        double max = a[0];
        double min = a[0];
        int len = a.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (a[i] > max) max = a[i];
                if (a[i] < min) min = a[i];
            }
            if (a[i] > a[i + 1]) {
                if (a[i] > max) max = a[i];
                if (a[i + 1] < min) min = a[i + 1];
            }
            if (a[i] < a[i + 1]) {
                if (a[i] < min) min = a[i];
                if (a[i + 1] > max) max = a[i + 1];
            }
        }
        System.out.println();
        System.out.println("max = " + String.format("%.2f", max));
        System.out.println("min = " + String.format("%.2f", min));
    }


    //Бинараный поиск
    public static double binarySearch(double[] a, double x) {
        int low = 0;
        int high = a.length - 1;

        if (low > high) throw new IllegalArgumentException("Wrong index!\n low > high");
        while (low <= high) {
            int mid = (high + low) / 2;
            if (x == a[mid]) {
                return mid;
            } else if (x < a[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    //Проверка на простоту
    public static boolean checkPrimeNum(int x) {
        if (x != 2 && x % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(x);
        for (int i = 3; i <= sqrt; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
