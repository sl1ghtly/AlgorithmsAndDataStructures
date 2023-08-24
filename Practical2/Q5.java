/* Practical2 - Question 5
Eryk Gloginski
22/02/2022
Question 5*/

import java.util.*;

public class Q5 
{
    public static void main(String [] args)
    {
        //
        // Q5, Q13, Q14 USED ONLY 9 INTEGERS BECAUSE THE OUTPUT WOULD BE THE SAME
        //

        System.out.println("This is Question 5");
        int[] numList1 = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        int[] numList2 = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        System.out.println("Both before sorting: " + Arrays.toString(numList1));

        InsertionSort is = new InsertionSort();
        SelectionSort ss = new SelectionSort();
        System.out.println("Inserted Sort after sorting: ");
        int[] inserted = is.orderedInsertionSort(numList1);
        System.out.println(Arrays.toString(inserted));
        System.out.println("Selection Sort after sorting: ");
        int[] selected = ss.orderedSelectionSort(numList2);
        System.out.println(Arrays.toString(selected));
    }
}
