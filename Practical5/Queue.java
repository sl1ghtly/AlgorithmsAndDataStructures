/* Practical5 - Question 2
Eryk Gloginski
28/04/2022
The Queue class*/

class Queue {
   private int[] arr; // array to store queue elements
   private int front; // front points to the front element in the queue
   private int rear; // rear points to the last element in the queue
   private int capacity; // maximum capacity of the queue
   private int count; // current size of the queue

   // constructor
   public Queue(int size) {
      arr = new int[size];
      capacity = size;
      front = 0;
      rear = -1;
      count = 0;
   }

   // function to remove from queue
   public int remove() {
      // checks if it's empty and exits if it is
      if (isEmpty()) {
         System.exit(-1);
      }

      // continue method
      int x = arr[front];

      front = (front + 1) % capacity;
      count--;

      return x;
   }

   // function to add from queue
   public void add(int item) {
      // checks if it's full and exits if it is
      if (isFull()) {
         System.exit(-1);
      }

      // continue method
      rear = (rear + 1) % capacity;
      arr[rear] = item;
      count++;
   }

   // peek at the front
   public int peek() {
      // checks if it's empty and exits if it is
      if (isEmpty()) {
         System.exit(-1);
      }
      // return item on front if is not empty
      return arr[front];
   }

   // get the size of the queue
   public int size() {
      return count;
   }

   // checks if the queue is empty
   public boolean isEmpty() {
      return (size() == 0);
   }

   // checks if the queue is full
   public boolean isFull() {
      return (size() == capacity);
   }

   // prints the queue
   public void printQueue() {
      // continue method
      for (int i = 0; i < count; i++) {
         System.out.print(arr[i] + ",");
      }
   }
}