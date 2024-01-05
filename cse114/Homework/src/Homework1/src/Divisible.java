package Homework1.src;// Tae Kim, 115331743, problem 7

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Determine and display the result
        System.out.println("Is " + number + " divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
    }
}