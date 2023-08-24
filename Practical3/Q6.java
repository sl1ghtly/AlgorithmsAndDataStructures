/* Practical1 - Question 6
Eryk Gloginski
08/03/2022
Writing a small helper class to create a Sentence object and use reverseString method */

public class Q6 {
    public static void main(String[] args) {
        String text1 = "Sentence";
        String text2 = "Adam, I'm Ada";
        Sentence str1 = new Sentence(text1);
        Sentence str2 = new Sentence(text2);

        System.out.println("Reverse String 1: " + str1.reverseString(text1));
        System.out.println("Reverse String 1: " + str2.reverseString(text2));
    }
}
