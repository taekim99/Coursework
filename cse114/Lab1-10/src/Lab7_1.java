// Tae Kim, CSE 114, Section1, Lab7_1, Feb 20, 2023
import java.util.Scanner;
public class Lab7_1 {
    public static void main(String[] args) {
        // Prompt the user to enter number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the phone number: ");
        String number = input.next();

        // Compute it
        String num1 = number.substring(0, 3);
        String num2 = number.substring(3, 6);
        String num3 = number.substring(6);

        // Display it
        System.out.println("Formatted phone number: (" + num1 + ")" + num2 + "-" + num3);
    }
}
