/* Practical2 - Question 6
Eryk Gloginski
22/02/2022
Question 6*/

import java.util.*;

public class Q6 
{
    public static void main(String [] args)
    {
        //
        // Q6, Q13, Q14 USED ONLY 9 INTEGERS BECAUSE THE OUTPUT WOULD BE THE SAME
        //
        
        System.out.println("This is Question 6");
        int[] numList1 = {-5, 3, 6, 9, 11, 16, 22, 34, 40};
        int[] numList2 = {-5, 3, 6, 9, 11, 16, 22, 34, 40};
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