/* Practical1 - Question 1
Eryk Gloginski
08/03/2022
Implementing myFactorial*/

public class Factorial
{
    // Q1 myFactorial method
    public int myFactorial(int num)
    {
        if(num == 1)
            return 1;
        
        else
        {
            return(num*(myFactorial(num-1)));
        }
    }
}