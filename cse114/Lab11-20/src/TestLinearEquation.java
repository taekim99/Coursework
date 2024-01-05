// Tae Kim, CSE 114, Section1, Lab18_1_2, April 10, 2023
import java.util.Scanner;
public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation lin = new LinearEquation(a, b, c, d, e, f);

        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution");
            System.exit(1);
        }

        System.out.println("X is " + lin.getX() + " and Y is " + lin.getY());

    }
}