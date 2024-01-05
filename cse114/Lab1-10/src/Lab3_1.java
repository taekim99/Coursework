// Tae Kim, CSE 114, Section1, Lab3_1, Feb 6, 2023
import java.util.Scanner;
public class Lab3_1 {
    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a Celsius degree
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        // Convert it to a Fahrenheit degree
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // display the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}