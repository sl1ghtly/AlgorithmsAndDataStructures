/* Practical1 - Question 6
Eryk Gloginski
11/02/2022
Question 6*/

import java.util.*;

public class Q6
{
    public static void main(String [] args)
    {
        
        //
        // Q6 USED ONLY 9 INTEGERS BECAUSE THE OUTPUT WOULD BE THE SAME
        //

        System.out.println("This is Question 6");
        int[] sortedNumList = {-5, 3, 6, 9, 11, 16, 22, 34, 40};
        System.out.println("sortedNumList before sorting: " + Arrays.toString(sortedNumList));

        // sort already sorted
        BubbleSort bs = new BubbleSort();
        sortedNumList = bs.orderedBubbleSort(sortedNumList);
        System.out.println("sortedNumList before sorting: " + Arrays.toString(sortedNumList));
    }
}