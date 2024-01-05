// Tae Kim, CSE 114, Section1, Lab4_2, Feb 8, 2023

import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        // Prompt the user to enter x and y
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Compute the distance
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Display the result
        System.out.println("The distance between the two points is " + distance);
    }
}