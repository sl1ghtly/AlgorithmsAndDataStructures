/* Practical2 - Question 3
Eryk Gloginski
22/02/2022
Implementing selectionSort*/

import java.util.ArrayList;

public class SelectionSort
{
    //
    // Q3
    //
        
    public int[] orderedSelectionSort(int[] arr)
    {
        // declare comparisons and swaps
        int comparisons = 0; int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            // assume first value is minimum
            int min = i;
            comparisons++;

            // move through unsorted array
            for (int j = i + 1; j < arr.length; j++)
            {
                // find minimum element in unsorted array
                if (arr[j] < arr[min])
                {
                    min = j;
                    comparisons++;
                }
            }

            // swap minimum if minimum is not i
            if (min != i)
            {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                swaps++;
            }
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return arr;
    }

    public int[] reversedSelectionSort(int[] arr)
    {
        // declare comparisons and swaps
        int comparisons = 0; int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            // assume first value is maximum
            int max = i;
            comparisons++;

            // move through unsorted array
            for (int j = i + 1; j < arr.length; j++)
            {
                // find maximum element in unsorted array
                if (arr[j] > arr[max])
                {
                    max = j;
                    comparisons++;
                }
            }

            // swap maximum if maximum is not i
            if (max != i)
            {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
                swaps++;
            }
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return arr;
    }

    //
    // Q9
    //

    ArrayList<Integer> orderedArrayList(ArrayList<Integer> arr)
    {
        // declare comparisons and swaps
        int comparisons = 0; int swaps = 0;

        for (int i = 0; i < arr.size() - 1; i++)
        {
            // assume first value is minimum
            int min = i;
            comparisons++;

            // move through unsorted arraylist
            for (int j = i + 1; j < arr.size(); j++)
            {
                // find minimum element in unsorted arraylist
                if (arr.get(j) < arr.get(min))
                {
                    min = j;
                    comparisons++;
                }
            }

            // swap minimum if minimum is not i
            if (min != i)
            {
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);
                swaps++;
            }
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return arr;
    }

    ArrayList<Integer> reversedArrayList(ArrayList<Integer> arr)
    {
        // declare comparisons and swaps
        int comparisons = 0; int swaps = 0;

        for (int i = 0; i < arr.size() - 1; i++)
        {
            // assume first value is maximum
            int max = i;
            comparisons++;

            // move through unsorted arraylist
            for (int j = i + 1; j < arr.size(); j++)
            {
                // find maximum element in unsorted arraylist
                if (arr.get(j) > arr.get(max))
                {
                    max = j;
                    comparisons++;
                }
            }

            // swap maximum if maximum is not i
            if (max != i)
            {
                int temp = arr.get(i);
                arr.set(i, arr.get(max));
                arr.set(max, temp);
                swaps++;
            }
        }
        System.out.println("Comparisons: " + comparisons + " | Swaps: " + swaps);
        return arr;
    }
}

