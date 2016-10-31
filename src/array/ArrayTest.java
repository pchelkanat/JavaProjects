package array;

import static array.Array.*;
import static array.ArraySorts.*;

/**
 * Created by Наталья on 30.10.2016.
 */
public class ArrayTest {
    public static void main(String[] args) {

        double[] b = new double[10];
        randomPrintArray(b);
        getMaxAndMin(b);
        //System.out.println("Sum = "+String.format("%.2f", getSum(b)));
        System.out.println("Average = " + String.format("%.2f", average(b)));

        swapElements(b, 2, 6);
        System.out.print("After swap 2 & 6: ");
        printArray(b);
        System.out.println();

        bubbleSort(b);
        System.out.print("After bubbleSort: ");
        printArray(b);
        System.out.println();

        swapElements(b, 1, 4);
        System.out.print("After swap 1 & 4: ");
        printArray(b);
        System.out.println();

        System.out.println("After binarySearch: " + String.format("%.2f", binarySearch(b, 2.0)));

        System.out.println();
        double[] d = new double[10];
        randomPrintArray(d);

        qSort(d, 0, d.length - 1);
        System.out.println();
        System.out.print("After qSort: ");
        printArray(d);
        System.out.println();


        System.out.println();
        double[] c = new double[10];
        randomPrintArray(c);
        selectionSort(c);
        System.out.println();
        System.out.print("After selectionSort: ");
        printArray(c);
        System.out.println();

        System.out.println("CheckPrimeNum: " + checkPrimeNum(13));
    }
}
