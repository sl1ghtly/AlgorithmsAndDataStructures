/* Practical1 - Question 5
Eryk Gloginski
11/02/2022
Question 5*/

import java.util.*;

public class Q5
{
    public static void main(String [] args)
    {
        
        //
        // Q5 USED ONLY 9 INTEGERS BECAUSE THE OUTPUT WOULD BE THE SAME
        //

        System.out.println("This is Question 5");
        int[] numList = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        System.out.println("numList before sorting: " + Arrays.toString(numList));

        // sort it
        BubbleSort bs = new BubbleSort();
        numList = bs.orderedBubbleSort(numList);
        System.out.println("numList before sorting: " + Arrays.toString(numList));
    }
}