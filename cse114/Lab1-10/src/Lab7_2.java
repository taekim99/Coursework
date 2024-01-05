// Tae Kim, CSE 114, Section1, Lab7_2, Feb 20, 2023
import java.util.Scanner;
public class Lab7_2 {
    public static void main(String[] args) {
        // Prompt the user to enter numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String number = input.next();

        // Check whether it is correct
        String num1 = number.substring(0, 3);
        String num2 = number.substring(4, 6);
        String num3 = number.substring(7);
        String totalNum = num1 + "-" + num2 + "-" + num3;

        // Display the result
        if (totalNum.equals(number))
            System.out.println(number + " is a valid social security number");
        else
            System.out.println(number + " is an invalid social security number");
    }
}
