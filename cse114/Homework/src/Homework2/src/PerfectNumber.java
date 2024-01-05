package Homework2.src;// Tae Kim, 115331743, problem 4
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        // Prompt the user to enter limit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = input.nextInt();

        // Find divisors for numbers, display
        System.out.print("The perfect numbers below " + limit + " are: ");

        int sum;
        for (int i = 1; i <= limit; i++) {
            sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    sum += j;
            }
            if (sum - i == i)
                System.out.print(i + " ");
        }

        System.out.println("\b.");
    }
}
