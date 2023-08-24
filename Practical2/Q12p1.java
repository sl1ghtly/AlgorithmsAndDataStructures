/* Practical1 - Question 12
Eryk Gloginski
22/02/2022
Question 12*/

import java.util.*;

public class Q12p1 {
    public static void main(String [] args)
    {
        //
        // Q1, Q12 Insertion Sort Verification
        //

        System.out.println("This is Question 12 Insertion Verification");
        int[] numList = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        System.out.println("numList before sorting: " + Arrays.toString(numList));

        int comparisons = 0; int swaps = 0;

        for (int i = 0; i < numList.length; i++)
        {
            int next = numList[i];
            int j = i;
            comparisons++;

            while (j > 0 && numList[j - 1] > next)
            {
                comparisons++;
                numList[j] = numList[j - 1];
                j--;
                swaps++;
                System.out.println("Finishing at " + (swaps) + " swaps?");
            }
            numList[j] = next;
            System.out.println("numList after pass '" + (i + 1) + "': " + Arrays.toString(numList));
        }
        System.out.println("numList after sorting: " + Arrays.toString(numList));
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
    }
}
