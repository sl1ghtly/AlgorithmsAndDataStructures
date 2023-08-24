/* Practical1 - Question 9
Eryk Gloginski
11/02/2022
Question 9*/

import java.util.*;

public class Q9 {
    public static void main(String [] args)
    {
        //
        // Q9
        //
        
        int[] list = {22, 11, 34, -5, 3, 40, 9, 16, 6};
        BubbleSort bs = new BubbleSort();
        ArrayList<Integer> numListQ5 = new ArrayList<Integer>();
        ArrayList<Integer> numListQ6 = new ArrayList<Integer>();
        ArrayList<Integer> numListQ7 = new ArrayList<Integer>();
        for (int i = 0; i < list.length - 1; i++)
        {
            numListQ5.add(list[i]);
            numListQ6.add(list[i]);
            numListQ7.add(list[i]);
        }

        //
        // Q13, Q14 USED ONLY 9 INTEGERS BECAUSE THE OUTPUT WOULD BE THE SAME
        //

        // unordered
        System.out.println("Unordered");
        for (int num : list)
        {
            System.out.print(num + " ");
        }

        // ordered
        System.out.println();
        System.out.println("Ordered");
        numListQ5 = bs.orderedArrayList(numListQ5);
        for (int num : numListQ5)
        {
            System.out.print(num + " ");
        }

        // already ordered
        Collections.sort(numListQ6);
        System.out.println();
        System.out.println("Already Ordered");
        numListQ6 = bs.orderedArrayList(numListQ6);
        for (int num : numListQ6)
        {
            System.out.print(num + " ");
        }

        // reversed
        System.out.println();
        System.out.println("Reversed");
        numListQ7 = bs.reversedArrayList(numListQ7);
        for (int num : numListQ7)
        {
            System.out.print(num + " ");
        }
    }
}
