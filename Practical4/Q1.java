/* Practical4 - Question 1
Eryk Gloginski
31/03/2022
Code for the first 20 numbers of the fibbonaci sequence */

public class Q1 {
   public static void main(String[] args) {
      // first 2 numbers
      int num1 = 0; 
      int num2 = 1;
      // how many numbers we want to display
      int amount = 20;
      
      while (amount != 0) {
         // print number
         System.out.print(num1 + ", ");
         
         // swap nums and decrement amount
         int num3 = num2 + num1;
         num1 = num2;
         num2 = num3;
         amount--;
      }
   }
}