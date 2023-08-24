/* Practical5 - Question 2
Eryk Gloginski
28/04/2022
The Stack class*/

class Stack {
   private int arr[];
   private int top;
   private int capacity;
   private int currentCap;

   // Constructor to initialize the stack
   Stack(int size) {
      arr = new int[size];
      capacity = size;
      top = -1;
      currentCap = 0;
   }

   // add/push element into stack
   public void push(int x) {
      // checks if it's full and exits if it is
      if (isFull()) {
         System.exit(-1);
      }
      
      // continue method
      currentCap++;
      arr[++top] = x;
   }

   // remove/pop element out of stack
   public int pop() {
      // checks if it's empty and exits if it is
      if (isEmpty()) {
         System.exit(-1);
      }

      // continue method and decrease stack size by 1 + return removed item
      currentCap--;
      return arr[top--];
   }

   // peek at the front
   public int peek() {
      // checks if it's not empty and returns top element in stack, else exits
      if (!isEmpty()) {
         return arr[top];
      } else {
         System.exit(-1);
      }

      return -1;
   }

   // get the size of the stack
   public int size() {
      return top + 1;
   }

   // checks if the stack is empty
   public boolean isEmpty() {
      return top == -1;
   }

   // checks if the stack is full
   public boolean isFull() {
      return top == capacity - 1;
   }
   
   // prints the stack
   public void printQueue() {
      // continue method
      for (int i = 0; i < currentCap; i++) {
         System.out.print(arr[i] + ",");
      }
   }
}