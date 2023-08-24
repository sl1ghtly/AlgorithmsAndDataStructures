/* Practical1 - Question 3
Eryk Gloginski
11/02/2022
Implementing bubbleSort*/

import java.util.ArrayList;

public class BubbleSort
{
    
    //
    // Q1, Q2, Q3, Q13, Q14
    //

    // orderedBubbleSort method implementation
    public int[] orderedBubbleSort(int[] array)
    {
        // Declare a boolean
        boolean sorted = false;
        int comparisons = 0; int swaps = 0;

        // First for loop to loop n-1 times through the array
        for (int i = 0; i < array.length - 1 && !sorted; i++)
        {
            // Assume the array is sorted
            sorted = true;
            comparisons++;

            // Second for loop to check the numbers excluding last one
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    // Swap elements if left is bigger than right
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                    // Array was not sorted
                    sorted = false;
                    swaps++;
                }
                comparisons++;
            }
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return array;
    }

    // reversedBubbleSort method implementation
    public int[] reversedBubbleSort(int[] array)
    {
        // Declare a boolean
        boolean sorted = false;
        int comparisons = 0; int swaps = 0;

        // First for loop to loop n-1 times through the array
        for (int i = 0; i < array.length - 1 && !sorted; i++)
        {
            // Assume the array is sorted
            sorted = true;
            comparisons++;

            // Second for loop to check the numbers excluding last one
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j + 1] < array[j])
                {
                    // Swap elements if left is bigger than right
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                    // Array was not sorted
                    sorted = false;
                    swaps++;
                }
                comparisons++;
            }
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return array;
    }

    //
    // Q10, Q13, Q14
    //

    // orderedBubbleSort method implementation for ArrayList
    public ArrayList<Integer> orderedArrayList(ArrayList<Integer> array)
    {
        // Declare a boolean
        boolean sorted = false;
        int comparisons = 0; int swaps = 0;

        // First for loop to loop n-1 times through the array
        for (int i = 0; i < array.size() - 1 && !sorted; i++)
        {
            // Assume the array is sorted
            sorted = true;
            comparisons++;

            // Second for loop to check the numbers excluding last one
            for (int j = 0; j < array.size() - i - 1; j++)
            {
                if (array.get(j) > array.get(j + 1))
                {
                    // Swap elements if left is bigger than right
                    int temp = array.get(j + 1);
                    array.set(j + 1, array.get(j));
                    array.set(j, temp);

                    // Array was not sorted
                    sorted = false;
                    swaps++;
                }
                comparisons++;
            }
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return array;
    }

    // reversedBubbleSort method implementation for ArrayList
    public ArrayList<Integer> reversedArrayList(ArrayList<Integer> array)
    {
        // Declare a boolean
        boolean sorted = false;
        int comparisons = 0; int swaps = 0;

        // First for loop to loop n-1 times through the array
        for (int i = 0; i < array.size() - 1 && !sorted; i++)
        {
            // Assume the array is sorted
            sorted = true;
            comparisons++;

            // Second for loop to check the numbers excluding last one
            for (int j = 0; j < array.size() - i - 1; j++)
            {
                if (array.get(j + 1) < array.get(j))
                {
                    // Swap elements if left is bigger than right
                    int temp = array.get(j + 1);
                    array.set(j + 1, array.get(j));
                    array.set(j, temp);

                    // Array was not sorted
                    sorted = false;
                    swaps++;
                }
                comparisons++;
            }
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return array;
    }


}