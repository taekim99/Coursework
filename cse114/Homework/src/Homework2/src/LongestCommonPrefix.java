package Homework2.src;// Tae Kim, 115331743, problem3
import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        // Prompt the user to enter two strings
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        String second = input.nextLine();

        // Find same words
        String sameWords = "";
        for (int i = 0; i <= first.length() || i <= second.length(); i++) {
            char a = first.charAt(i);
            char b = second.charAt(i);
            if (a == b)
                sameWords += a;
            else
                break;
        }

        // Display the largest common prefix of the two strings
        if (sameWords.equals(""))
            System.out.println(first + " and " + second + " have no common prefix");
        else
            System.out.println("The common prefix is: " + sameWords);
        }
    }