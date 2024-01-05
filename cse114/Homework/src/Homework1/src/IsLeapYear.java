package Homework1.src;// Tae Kim, 115331743, problem 4

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter in a year: ");
        int year = input.nextInt();

        // Calculate whether it is a leap year
        // Display the result
        if (year % 400 == 0)
            System.out.println(year + " is a leap year");
        else if (year % 400 != 0 && year % 100 == 0)
            System.out.println(year + " is not a leap year");
        else if (year % 400 != 0 && year % 100 != 0 && year % 4 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}