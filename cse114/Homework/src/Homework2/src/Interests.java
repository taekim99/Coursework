package Homework2.src;// Tae Kim, 115331743, problem 2
import java.util.Scanner;
public class Interests {
    public static void main(String[] args) {
        // Prompt the user to enter values
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        // display the monthly and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8.
        double annualInterestRate = 5.0;
        final double LAST_INTEREST_RATE = 8.0;
        double monthlyInterestRate;
        double monthlyPayment;
        double totalPayment;

        System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        while (annualInterestRate <= LAST_INTEREST_RATE) {
            monthlyInterestRate = annualInterestRate / 1200;
            monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
            totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%-1.3f", annualInterestRate);
            System.out.print("%              ");
            System.out.printf("%-20.2f%-20.2f\n", monthlyPayment, totalPayment);
            annualInterestRate += 1 / 8.0;
        }
    }
}