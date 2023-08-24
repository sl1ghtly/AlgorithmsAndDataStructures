/* Practical1 - Question 2
Eryk Gloginski
08/03/2022
Implementing Sentence class and isPalindrome method */

public class Sentence
{
    // Q2 Sentence class
    private String text;

    public Sentence(String atext)
    {
        text = atext;
    }
    // Q2 isPalindrome method
    public boolean isPalindrome()
    {
        int length = text.length();
        // separate case for shortest strings
        if (length <= 1) { return true; }
        // get first and last chars as lowercase
        char first = Character.toLowerCase((text.charAt(0)));
        char last = Character.toLowerCase((text.charAt(length - 1)));
        // if both are letters
        if (Character.isLetter(first) && Character.isLetter(last))
        {
            // if first is same as last
            if (first == last)
            {
                // remove first and last
                Sentence shorter = new Sentence(text.substring(1, length - 1));
                return shorter.isPalindrome();
            }
            else { return false; }
        }
        // if last character is not a letter
        else if (!Character.isLetter(last))
        {
            // remove last character
            Sentence shorter = new Sentence(text.substring(0, length - 1));
            return shorter.isPalindrome();
        }
        // check if first character is not a letter
        else
        {
            // remove first character
            Sentence shorter = new Sentence(text.substring(1));
            return shorter.isPalindrome();
        }
    }
    // Q4 improved isPalindrome method
    public boolean improvedIsPalindrome(int start, int end)
    {
        // separate case for substrings of length 0 and 1
        if (start >= end) { return true; }
        // get first and last chars as lowercase
        char first = Character.toLowerCase(text.charAt(start));
        char last = Character.toLowerCase(text.charAt(end));
        // if both are letters
        if (Character.isLetter(first) && Character.isLetter(last))
        {
            // if first is same as last
            if (first == last)
            {
                return improvedIsPalindrome(start + 1, end - 1);
            }
            else { return false; }
        }
        // if last char is not a letter
        else if (!Character.isLetter(last))
        {
            return improvedIsPalindrome(start, end - 1);
        }
        // check if first char is not a letter
        else
        {
            return improvedIsPalindrome(start + 1, end);
        }
    }
    // Q5 reverseString method
    public String reverseString(String str)
    {
        // if string is empty, just return it
        if (str.isEmpty()) { return str; }
        // recursive
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}