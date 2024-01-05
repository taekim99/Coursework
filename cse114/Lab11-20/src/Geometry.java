// Tae Kim, CSE 114, Section1, Lab13_2, Mar 22, 2023
import java.util.Scanner;
public class Geometry {
    public static double getTriangleArea(double[][] point) {
        double a = Math.sqrt(Math.pow(point[0][0] - point[1][0], 2) + Math.pow(point[0][1] - point[1][1], 2));
        double b = Math.sqrt(Math.pow(point[1][0] - point[2][0], 2) + Math.pow(point[1][1] - point[2][1], 2));
        double c = Math.sqrt(Math.pow(point[2][0] - point[0][0], 2) + Math.pow(point[2][1] - point[0][1], 2));
        double s = 1 / 2.0 * (a + b + c);
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        if (point[0][0] == point[0][1] && point[1][0] == point[1][1] && point[2][0] == point[2][1])
            return 0;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] point = new double[3][2];

        for (int row = 0; row < point.length; row++) {
            for (int col = 0; col < point[row].length; col++) {
                point[row][col] = input.nextDouble();
            }
        }

        System.out.println((getTriangleArea(point) > 0) ? "The area of the triangle is " + getTriangleArea(point) : "The three points are on the same line.");
    }
}
