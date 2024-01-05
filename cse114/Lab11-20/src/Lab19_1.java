// Tae Kim, CSE 114, Section1, Lab19_1, April 12, 2023
import java.util.Scanner;
import java.util.ArrayList;
public class Lab19_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String s = input.nextLine();

        System.out.print("Elements of the Character array list: ");
        ArrayList<Character> arr = toCharacterArray(s);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("\nElements of the Character array list: " + toCharacterArray(s)); // First trial
    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> charArray = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            charArray.add(s.charAt(i));
        }
        return charArray;
    }
}