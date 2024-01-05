// Tae Kim, CSE 114, Section1, Lab10_1, Mar 1, 2023
import java.util.Scanner;
public class In2Cm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value in inches: ");
        double inch = input.nextDouble();

        System.out.println(inch + " inches are " + inToCm(inch) +" cm");
    }

    public static double inToCm(double in) {
        return in * 2.54;
    }
}
