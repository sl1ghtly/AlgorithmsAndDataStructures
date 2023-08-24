/* Practical5 - Question 2
Eryk Gloginski
28/04/2022
Tester class for the Queue*/

public class Q2 {

	public static void main(String[] args)
	{
      // declare the queue
		Queue queue = new Queue(5);

		// add elements from 1 to 5 into the que and list queue
      queue.add(1);
      System.out.print("Output 1 => Queue: [");
		queue.printQueue();
      System.out.println("]");
      queue.add(2);
      System.out.print("Output 2 => Queue: [");
      queue.printQueue();
      System.out.println("]");
      queue.add(3);
      System.out.print("Output 3 => Queue: [");
      queue.printQueue();
      System.out.println("]");
      queue.add(4);
      System.out.print("Output 4 => Queue: [");
      queue.printQueue();
      System.out.println("]");
      queue.add(5);
      System.out.print("Output 5 => Queue: [");
      queue.printQueue();
      System.out.println("]");

	   // peek at the front of the queue
		int head = queue.peek();
		System.out.println("Output 6 => queueTop: [" + head +"]");
      
      // list queue after peeking
      System.out.print("Output 7 => Queue: [");
      queue.printQueue();
      System.out.println("]");
      
      // remove from the queue
      int removed = queue.remove();
		System.out.println("Output 8 => Removed: [" + removed + "]");
      
      // list queue after removing
      System.out.print("Output 9 => Queue: [");
      queue.printQueue();
      System.out.println("]");

      // show queue size
		int size = queue.size();
		System.out.println("Output 10 => Final Size of Queue: [" +  size + "]");
	}
}
