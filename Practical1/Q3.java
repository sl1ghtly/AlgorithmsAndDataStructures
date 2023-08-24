/* Practical1 - Question 3
Eryk Gloginski
11/02/2022
Question 3*/

import java.util.*;

public class Q3
{
    public static void main(String [] args)
    {
        
        //
        // Q3, Q12
        //
        
        System.out.println("This is Question 3");
        int[] numList = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        System.out.println("numList before sorting: " + Arrays.toString(numList));
        
        // Declare a boolean
        boolean sorted = false;
        int comparisons = 0; int swaps = 0;

        // First for loop to loop n-1 times through the array
        for (int i = 0; i < numList.length - 1 && !sorted; i++)
        {
            // Assume the array is sorted
            sorted = true;
            comparisons++;

            // Second for loop to check the numbers excluding last one
            for (int j = 0; j < numList.length - i - 1; j++)
            {
                if (numList[j] > numList[j + 1])
                {
                    // Swap elements if left is bigger than right
                    int temp = numList[j];
                    numList[j] = numList[j + 1];
                    numList[j + 1] = temp;

                    // Array was not sorted
                    sorted = false;
                    swaps++;
                    System.out.println("Finishing at " + (swaps) + " swaps?");
                }
            }
            comparisons++;
            System.out.println("numList after pass '" + (i + 1) + "': " + Arrays.toString(numList));
        }
        System.out.println("numList after sorting: " + Arrays.toString(numList));
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
    }
}