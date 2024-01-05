// Tae Kim, CSE 114, Section1, Lab9_2, Feb 27, 2023
import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word and alphabet: ");
        String word = input.next();
        String al = input.next();
        char alphabet = al.charAt(0);

        System.out.println("How many alphabets in the word? : " + howMany(word, alphabet));
    }

    public static int howMany(String w, char a) {
        int sum = 0;
        for (int i = 0 ; i < w.length() ; i++) {
            if (w.charAt(i) == a) {
                sum++;
            }
        }
        return sum;
    }
}
