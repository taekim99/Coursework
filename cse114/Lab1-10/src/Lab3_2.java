// Tae Kim, CSE 114, Section1, Lab3_2, Feb 6, 2023
import java.util.Scanner;
public class Lab3_2 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter different values
        System.out.print("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        // Calculate the energy needed
        double energy = water * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed is " + energy);
    }
}