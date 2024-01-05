// Tae Kim, CSE 114, Section1, Lab5_2, Feb 13, 2023
import java.util.Scanner;
public class Lab5_2 {
    public static void main(String[] args) {
        // Prompt the user to enter values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of package: ");
        int weight = input.nextInt();

        // Display
        if (weight > 20)
            System.out.println("The package cannot be shipped");
        else if (weight > 10)
            System.out.println("The cost is 10.5");
        else if (weight > 3)
            System.out.println("The cost is 8.5");
        else if (weight > 1)
            System.out.println("The cost is 5.5");
        else if (weight > 0)
            System.out.println("The cost is 3.5");
        else
            System.out.println("Invalid input");
    }
}
