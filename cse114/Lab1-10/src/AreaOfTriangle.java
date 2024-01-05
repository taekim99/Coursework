// Tae Kim, CSE 114, Section1, Lab9_1, Feb 27, 2023
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values of base and height: ");
        double base = input.nextDouble();
        double height = input.nextDouble();

        System.out.println("Area of this triangle with base 15 and height 8 is: " + areaOfTriangle(base, height));
    }

    public static double areaOfTriangle(double base, double height) {
        double area = 1.0 / 2.0 * base * height;
        return area;
    }
}
