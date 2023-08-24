/* Practical1 - Question 8
Eryk Gloginski
22/02/2022
Question 8*/

import java.util.*;

public class Q8 {
    public static void main(String [] args)
    {
        //
        // Q8 USED ONLY 9 INTEGERS BECAUSE THE OUTPUT WOULD BE THE SAME
        //
        
        int[] list = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        InsertionSort is = new InsertionSort();
        SelectionSort ss = new SelectionSort();
        ArrayList<Integer> num5p1 = new ArrayList<Integer>();
        ArrayList<Integer> num5p2 = new ArrayList<Integer>();
        ArrayList<Integer> num6p1 = new ArrayList<Integer>();
        ArrayList<Integer> num6p2 = new ArrayList<Integer>();
        ArrayList<Integer> num7p1 = new ArrayList<Integer>();
        ArrayList<Integer> num7p2 = new ArrayList<Integer>();
        for (int i = 0; i < list.length - 1; i++)
        {
            num5p1.add(list[i]);
            num5p2.add(list[i]);
            num6p1.add(list[i]);
            num6p2.add(list[i]);
            num7p1.add(list[i]);
            num7p2.add(list[i]);
        }

        //
        // Q11 USED ONLY 9 INTEGERS BECAUSE THE OUTPUT WOULD BE THE SAME
        //

        System.out.println("Unordered: ");
        for (int num : list)
        {
            System.out.print(num + " ");
        }

        // ordered
        System.out.println();
        System.out.println("Ordered Insertion: ");
        num5p1 = is.orderedArrayList(num5p1);
        for (int num : num5p1)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Ordered Selection: ");
        num5p2 = ss.orderedArrayList(num5p2);
        for (int num : num5p2)
        {
            System.out.print(num + " ");
        }

        // already ordered
        Collections.sort(num6p1);
        Collections.sort(num6p2);
        System.out.println();
        System.out.println("Already Ordered Insertion: ");
        num6p1 = is.orderedArrayList(num6p1);
        for (int num : num6p1)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Already Ordered Selection: ");
        num6p2 = ss.orderedArrayList(num6p2);
        for (int num : num6p2)
        {
            System.out.print(num + " ");
        }

        // reversed
        System.out.println();
        System.out.println("Reversed Insertion: ");
        num7p1 = is.reversedArrayList(num7p1);
        for (int num : num7p1)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Reversed Selection: ");
        num7p2 = ss.reversedArrayList(num7p2);
        for (int num : num7p2)
        {
            System.out.print(num + " ");
        }

    }
}