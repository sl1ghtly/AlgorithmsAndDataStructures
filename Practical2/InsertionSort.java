/* Practical2 - Question 4
Eryk Gloginski
22/02/2022
Implementing insertionSort*/

import java.util.ArrayList;

public class InsertionSort
{
    //
    // Q4, Q13, Q14
    //
        
    public int[] orderedInsertionSort(int[] arr)
    {
        // declare comparisons and swaps
        int comparisons = 0; int swaps = 0;

        // move through unsorted array
        for (int i = 0; i < arr.length; i++)
        {
            int next = arr[i];
            int j = i;
            comparisons++;

            // move elements that are greater than next one pos ahead of their current one
            while (j > 0 && arr[j - 1] > next)
            {
                comparisons++;
                arr[j] = arr[j - 1];
                j--;
                swaps++;
            }
            arr[j] = next;
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return arr;
    }

    public int[] reversedInsertionSort(int[] arr)
    {
        // declare comparisons and swaps
        int comparisons = 0; int swaps = 0;

        // move through unsorted array
        for (int i = 0; i < arr.length; i++)
        {
            int next = arr[i];
            int j = i;
            comparisons++;
            
            // move elements that are greater than next one pos behind of their current one
            while (j > 0 && arr[j - 1] < next)
            {
                comparisons++;
                arr[j] = arr[j - 1];
                j--;
                swaps++;
            }
            arr[j] = next;
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return arr;
    }

    //
    // Q9, Q13, Q14
    //

    public ArrayList<Integer> orderedArrayList(ArrayList<Integer> arr)
    {
        // declare comparisons and swaps
        int comparisons = 0; int swaps = 0;

        // move through unsorted array
        for (int i = 0; i < arr.size(); i++)
        {
            int next = arr.get(i);
            int j = i;
            comparisons++;

            // move elements that are greater than next one pos ahead of their current one
            while (j > 0 && arr.get(j - 1) > next)
            {
                comparisons++;
                arr.set(j, arr.get(j - 1));
                j--;
                swaps++;
            }
            arr.set(j, next);
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return arr;
    }

    public ArrayList<Integer> reversedArrayList(ArrayList<Integer> arr)
    {
        // declare comparisons and swaps
        int comparisons = 0; int swaps = 0;

        // move through unsorted array
        for (int i = 0; i < arr.size(); i++)
        {
            int next = arr.get(i);
            int j = i;
            comparisons++;

            // move elements that are greater than next one pos behind of their current one
            while (j > 0 && arr.get(j - 1) < next)
            {
                comparisons++;
                arr.set(j, arr.get(j - 1));
                j--;
                swaps++;
            }
            arr.set(j, next);
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return arr;
    }
}
