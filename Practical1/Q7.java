/* Practical1 - Question 7
Eryk Gloginski
11/02/2022
Question 7*/

import java.util.*;

public class Q7
{
    public static void main(String [] args)
    {
        
        //
        // Q7 USED ONLY 9 INTEGERS BECAUSE THE OUTPUT WOULD BE THE SAME
        //
        
        System.out.println("This is Question 7");
        int[] numList = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        System.out.println("numList before sorting: " + Arrays.toString(numList));

        // reverse sort it
        BubbleSort bs = new BubbleSort();
        numList = bs.reversedBubbleSort(numList);
        System.out.println("numList before sorting: " + Arrays.toString(numList));
    }
}