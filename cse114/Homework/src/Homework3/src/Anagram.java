package Homework3.src;// Tae Kim, 115331743, problem 3
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String word2 = scanner.nextLine();

        if (isAnagram(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are NOT anagrams.");
        }
    }
    public static boolean isAnagram(String word1, String word2) {
        // To lowercase and remove spaces
        word1 = word1.toLowerCase().replaceAll(" ", ""); // Also I can use "//s" for " "
        word2 = word2.toLowerCase().replaceAll(" ", "");

        // Check the characters in word1 and word2
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            int index = word2.indexOf(c);
            if (index == -1) {
                return false;
            }
            word2 = word2.substring(0, index) + word2.substring(index + 1);
        }
        return word2.length() == 0;
    }
}