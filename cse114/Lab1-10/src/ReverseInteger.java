// Tae Kim, CSE 114, Section1, Lab10_3, Mar 1, 2023
import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int number) {
        String num = "";
        while (number > 0) {
            int remainder = number % 10;
            num += remainder;
            number /= 10;
        }
        System.out.println("Reverse number is " + num);
    }
}
