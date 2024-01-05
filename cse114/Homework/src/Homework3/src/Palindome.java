package Homework3.src;// Tae Kim, 115331743, problem 1
import java.util.Scanner;
public class Palindome {
    public static void main(String[] args) {
        // Prompt the user to enter the word
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String word = input.nextLine();

        // Convert it case-insensitive and ignore spaces
        String wordLower = word.toLowerCase();
        String newWord = wordLower.replaceAll(" ", "");

        // Check whether it is a palindrome
        boolean palindrome = false;
        for (int i = 0 ; i < newWord.length() ; i++) {
            if (newWord.charAt(newWord.length() - i - 1) == newWord.charAt(i)) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
        }

        // Display the result
        if (palindrome) {
            System.out.println("Input string " + word + " is a palindrome");
        } else {
            System.out.println("Input string " + word + " is NOT a palindrome");
        }
    }
}