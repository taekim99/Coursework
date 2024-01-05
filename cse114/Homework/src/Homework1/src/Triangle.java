package Homework1.src;// Tae Kim, 115331743, Problem8

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter side lengths
        System.out.print("Side: ");
        int a = input.nextInt();
        System.out.print("Side: ");
        int b = input.nextInt();
        System.out.print("Side: ");
        int c = input.nextInt();

        // Calculate correctly and display the result
        if (a + b < c || a + c < b || b + c < a)
            System.out.println("Invalid input!");
        else if (a == b && b == c)
            System.out.println("Equilateral");
        else if (a == b || b == c || c == a)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}