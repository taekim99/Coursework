package Homework2.src;// Tae Kim, 115331743, problem 5
import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        // Prompt the user to enter lower and upper limits
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lower = input.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = input.nextInt();

        System.out.print("The Armstrong numbers between " + lower + " and " + upper + " are: ");

        for (int i = lower; i <= upper; i++) {
            int num = i;
            int digitNum = (int) Math.log10(i) + 1;
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digitNum);
                num /= 10;
            }

            if (sum == i)
                System.out.print(i + " ");
        }
    }
}