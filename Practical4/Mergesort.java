/* Practical4 - Question 1
Eryk Gloginski
31/03/2022
Code for the MergeSort */

public class Mergesort {
   private static int first[];
   public static void main(String[] args) {
      // declare stopwatch
      StopWatch sw = new StopWatch();
   
      // first random array
      System.out.println("Random Array: ");
		// Get a random generated array
		int first[] = getArray();
		// prints the given array
		printArray(first);
		// sort the array
      sw.start();
		sort(first);
      sw.stop();
		System.out.println("");
		//prints the sorted array
		printArray(first);
      System.out.println("");
      long time1 = sw.getElapsedTime();
      System.out.println("Sorted in: " + time1 + " nanoseconds.");
      System.out.println("");
      sw.reset();
      
      // second sorted array
      System.out.println("Sorted Array: ");
		// Get a random generated array and sort it
		int second[] = first;
		// prints the given array
		printArray(second);
		// sort the array
      sw.start();
		sort(second);
      sw.stop();
		System.out.println("");
		//prints the sorted array
		printArray(second);
      System.out.println("");
      long time2 = sw.getElapsedTime();
      System.out.println("Sorted in: " + time2 + " nanoseconds.");
      System.out.println("");
      sw.reset();
      
      // doesn't work because I need to compare Integers with ints
      // third reverse sorted array
      System.out.println("Reverse Sorted Array: ");
		// Get a random generated array and rsort it
		int third[] = first;
		// prints the given array
		printArray(third);
		// sort the array
      sw.start();
		sort(third);
      sw.stop();
		System.out.println("");
		//prints the sorted array
		printArray(third);
      System.out.println("");
      long time3 = sw.getElapsedTime();
      System.out.println("Sorted in: " + time3 + " nanoseconds.");
      System.out.println("");
      sw.reset();
   }

   public static void sort(int arr[]) {
      int[] tempArray = new int[arr.length];
      mergeSort(arr, tempArray, 0, arr.length - 1);
   }

   public static void mergeSort(int arr[], int[] tempArray, int lowerIndex, int upperIndex) {
      if (lowerIndex == upperIndex) {
         return;
      } else {
         int midPt = (lowerIndex + upperIndex) / 2;
         mergeSort(arr, tempArray, lowerIndex, midPt);
         mergeSort(arr, tempArray, midPt + 1, upperIndex);
         merge(arr, tempArray, lowerIndex, midPt + 1, upperIndex);
      }
   }

   public static void merge(int arr[], int[] tempArray, int lowerIndexCursor, int higerIndex, int upperIndex) {
      int tempIndex = 0;
      int lowerIndex = lowerIndexCursor;
      int midIndex = higerIndex - 1;
      int totalItems = upperIndex - lowerIndex + 1;
      // While neither array is empty
      while (lowerIndex <= midIndex && higerIndex <= upperIndex) {
         // Compare the items of the two arrays and copy the smaller item into to third temp array
         if (arr[lowerIndex] < arr[higerIndex]) {
            tempArray[tempIndex++] = arr[lowerIndex++];
         } else {
            tempArray[tempIndex++] = arr[higerIndex++];
         }
      }

      while (lowerIndex <= midIndex) {
         tempArray[tempIndex++] = arr[lowerIndex++];
      }
      while (higerIndex <= upperIndex) {
         tempArray[tempIndex++] = arr[higerIndex++];
      }

      for (int i = 0; i < totalItems; i++) {
         arr[lowerIndexCursor + i] = tempArray[i];
      }
   }

   public static void printArray(int[] arr) {
      for (int i: arr) {
         System.out.print(i + " ");
      }
   }

   //populate array
   public static int[] getArray() {
      int size = 10000;
      int[] array = new int[size];
      int item = 0;
      for (int i = 0; i < size; i++) {
         item = (int)(Math.random() * 10000);
         array[i] = item;
      }
      return array;
   }

}