// Tae Kim, CSE 114, Section1, Lab4_3, Feb 8, 2023
import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {
        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        // Compute the population
        int population = ((((year - 2000) - 10) * 3) + 310);

        // Display the result
        System.out.println("Population estimate (millions of people) " + population);
    }
}