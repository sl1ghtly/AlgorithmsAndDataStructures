/* Practical1 - Question 7
Eryk Gloginski
08/03/2022
The insertionSort*/

import java.util.*;

public class Q7p2 {
    // Q7 USED ONLY 9 INTEGERS BECAUSE THE OUTPUT WOULD BE THE SAME
    public static void main(String[] args) {
        int[] numList1 = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        int[] numList2 = {-5, 3, 6, 9, 11, 16, 22, 34, 40};
        int[] numList3 = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        //normal sort
        System.out.println("numList1 before sorting: " + Arrays.toString(numList1));
        StopWatch sw = new StopWatch();
        InsertionSort is = new InsertionSort();
        sw.start();
        numList1 = is.orderedInsertionSort(numList1);
        sw.stop();
        System.out.println("numList1 after sorting: " + Arrays.toString(numList1));
        long time1 = sw.getElapsedTime();
        System.out.println("StopWatch stopped after: " + time1 + " nanoseconds.");
        System.out.println();
        sw.reset();
        System.out.println();

        //already sorted sort
        System.out.println("numList2 before sorting: " + Arrays.toString(numList2));
        sw.start();
        numList2 = is.orderedInsertionSort(numList2);
        sw.stop();
        System.out.println("numList2 after sorting: " + Arrays.toString(numList2));
        long time2 = sw.getElapsedTime();
        System.out.println("StopWatch stopped after: " + time2 + " nanoseconds.");
        System.out.println();
        sw.reset();
        System.out.println();

        //reverse sort
        System.out.println("numList3 before sorting: " + Arrays.toString(numList3));
        sw.start();
        numList3 = is.reversedInsertionSort(numList3);
        sw.stop();
        System.out.println("numList3 after sorting: " + Arrays.toString(numList3));
        long time3 = sw.getElapsedTime();
        System.out.println("StopWatch stopped after: " + time3 + " nanoseconds.");
        System.out.println();
    }
}
