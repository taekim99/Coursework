// Tae Kim, CSE 114, Section1, SphereVolumeCalculator, Feb 6, 2023
import java.util.Scanner;
public class SphereVolumeCalculator {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the positive radius of a sphere
        System.out.print("Enter in the radius of the sphere: ");
        double radius = input.nextDouble();

        // Calculate the volume of the sphere
        double volume = 4.0/3.0 * Math.PI * radius * radius * radius;

        // Display the result
        System.out.println("Volume of the sphere is " + volume);
    }
}