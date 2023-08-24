/* Practical4 - Question 1
Eryk Gloginski
31/03/2022
Code for the QuickSort */

public class Quicksort {
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
	
	// This method sorts an array and internally calls quickSort 

	public static void sort(int arr[]){
		int left = 0;
		int right = arr.length-1;
			
		quickSort(arr, left, right);
	}
	
	// This method is used to sort the array using quicksort algorithm.
	// It takes the left and the right end of the array as the two cursors.

	private static void quickSort(int arr[], int left,int right){
		
		// If both cursor scanned the complete array quicksort exits
		if(left >= right)
			return;
		
		// For simplicity, we took the rightmost item of the array as a pivot 
		int pivot = arr[right];
		int partition = partition(arr, left, right, pivot);
		
		// Recursively, calls the quicksort with the different left and right parameters of the sub-array
		quickSort(arr, left, partition-1);
		quickSort(arr, partition+1, right);
	}
	
	// This method is used to partition the given array and returns the integer which points to the sorted pivot index

	private static int partition(int arr[], int left,int right,int pivot){
		int leftCursor = left-1;
		int rightCursor = right;
		while(leftCursor < rightCursor){
         while(arr[++leftCursor] < pivot);
         while(rightCursor > 0 && arr[--rightCursor] > pivot);
         
			if(leftCursor >= rightCursor){
				break;
			}
         else{
				swap(arr, leftCursor, rightCursor);
			}
		}
		swap(arr, leftCursor, right);
		return leftCursor;
	}
	
   // This method is used to get the median of three value Q3
   public static int medianOfThree(int arr[], int left, int right) {
      int mid = (arr[left] + arr[right]) / 2;
      
      if (arr[right] < arr[left])
         swap(arr, left, right);
      if (arr[mid] < arr[left])
         swap(arr, mid, left);
      if (arr[right] < arr[mid])
         swap(arr, right, mid);
      
      return mid;
   }
   
	// This method is used to swap the values between the two given index

	public static void swap(int arr[], int left,int right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static void printArray(int arr[]){
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
	
   // create 10000 element random array
	public static int[] getArray(){
		int size=10000;
		int []array = new int[size];
		int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*10000); 
			array[i] = item;
		}
		return array;
	}

}