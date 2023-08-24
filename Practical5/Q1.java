/* Practical5 - Question 1
Eryk Gloginski
28/04/2022
Tester class for the Stack*/

public class Q1 {
	public static void main(String args[])
	{
		// Creating an empty Stack
		Stack stack = new Stack(5);
      
      // add elements 
      stack.push(42);
      System.out.print("Output 1 => Stack: [");
		stack.printQueue();
      System.out.println("]");
      stack.push(66);
      System.out.print("Output 2 => Stack: [");
		stack.printQueue();
      System.out.println("]");
      stack.push(99);
      System.out.print("Output 3 => Stack: [");
		stack.printQueue();
      System.out.println("]");
      
      // peek at the front of the stack
		int head = stack.peek();
		System.out.println("Output 4 => Stack Peek: [" + head +"]");
      
      //remove from stack
      stack.pop();
      System.out.print("Output 4 => Stack: [");
		stack.printQueue();
      System.out.println("]");
      
      // peek at the front of the stack
		head = stack.peek();
		System.out.println("Output 5 => Stack Peek: [" + head +"]");
      
      //remove from stack
      stack.pop();
      System.out.print("Output 5 => Stack: [");
		stack.printQueue();
      System.out.println("]");
      
      // peek at the front of the stack
		head = stack.peek();
		System.out.println("Output 6 => Stack Peek: [" + head +"]");
      
      //remove from stack
      stack.pop();
      System.out.print("Output 6 => Stack: [");
		stack.printQueue();
      System.out.println("]");
      
      
   }
}
