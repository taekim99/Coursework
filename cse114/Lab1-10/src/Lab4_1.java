// Tae Kim, CSE 114, Section1, Lab4_1, Feb 8, 2023
import java.util.Scanner;
public class Lab4_1 {
    public static void main(String[] args) {
        // Prompt the user to enter balance and interest rate
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate(e.g.,3 for 3%): ");
        int balance = input.nextInt();
        double annualInterestRate = input.nextDouble();

        // Compute monthly interest
        double interest = balance * (annualInterestRate / 1200);

        // Display the result
        System.out.printf("%s%.5f", "The interest is ", interest);
    }
}