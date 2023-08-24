/* Practical1 - Question 12
Eryk Gloginski
22/02/2022
Question 12*/

import java.util.*;

public class Q12p2 {
    public static void main(String [] args)
    {
        //
        // Q1, Q12 Insertion Sort Verification
        //

        System.out.println("This is Question 12 Selection Verification");
        int[] numList = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        System.out.println("numList before sorting: " + Arrays.toString(numList));

        int comparisons = 0; int swaps = 0;

        for (int i = 0; i < numList.length - 1; i++)
        {
            // assume first value is minimum
            int min = i;
            comparisons++;

            for (int j = i + 1; j < numList.length; j++)
            {
                if (numList[j] < numList[min])
                {
                    min = j;
                    comparisons++;
                }
            }

            // swap if minimum is not i
            if (min != i)
            {
                int temp = numList[i];
                numList[i] = numList[min];
                numList[min] = temp;
                swaps++;
                System.out.println("Finishing at " + (swaps) + " swaps?");
            }
            System.out.println("numList after pass '" + (i + 1) + "': " + Arrays.toString(numList));
        }
        System.out.println("numList after sorting: " + Arrays.toString(numList));
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
    }
}
