/* Practical1 - Question 3
Eryk Gloginski
08/03/2022
Writing a small helper class to create a Sentence object and use isPalindrome */

public class Q3 {
    public static void main(String[] args) 
    {
        String text1 = "Sentence";
        String text2 = "Adam, I'm Ada";
        int len1 = text1.length();
        int len2 = text2.length();
        Sentence str1 = new Sentence(text1);
        Sentence str2 = new Sentence(text2);

        System.out.println("Sentence 1: " + str1.isPalindrome());
        System.out.println("Sentence 2: " + str2.isPalindrome());
        System.out.println();
        System.out.println("Improved Method Sentence 1: " + str1.improvedIsPalindrome(0, len1 - 1));
        System.out.println("Improved Method Sentence 2: " + str2.improvedIsPalindrome(0, len2 - 1));
    }
}
