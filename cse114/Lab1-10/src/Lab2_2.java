// Tae Kim, CSE 114, Section1, Lab2-2, Feb 1, 2023
import java.util.Scanner;
public class Lab2_2 {
    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter v0, v1, and t
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        // Compute the average acceleration
        float a = (float)((v1 - v0) / t);

        // Display the result
        System.out.println("The average acceleration is " + a);
    }
}
