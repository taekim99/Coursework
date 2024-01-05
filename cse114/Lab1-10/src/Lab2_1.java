// Tae Kim, CSE 114, Section1, Lab2-1, Feb 1, 2023
public class Lab2_1 {
    public static void main(String[] args) {

        // Write the constant and given values
        final double PI = 3.14159;
        double radius = 5.5;

        // Compute the perimeter of the circle
        double perimeter = 2 * PI * radius;

        // Compute the area of the circle
        double area = radius * radius * PI;

        // Show the parameter and area of the circle
        System.out.println("The perimeter of the circle is " + perimeter);
        System.out.println("The area of the circle is " + area);
    }
}