// Tae Kim, 115331743, problem 1
import java.util.Scanner;
public class MatrixMultiply {
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        if (a[0].length != b.length) {
            System.out.println("the number of columns in a must be the same as the number of rows in b");
            System.exit(1);
        }

        double[][] multi = new double[a[0].length][b.length];
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                for (int n = 0; n < a[0].length; n++) {
                    multi[row][col] += a[row][n] * b[n][col];
                }
            }
        }
        return multi;
    }

    public static void main(String[] args) {
        System.out.print("Enter matrix1: ");
        Scanner input = new Scanner(System.in);
        double[][] arr1 = new double[3][3];
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        double[][] arr2 = new double[3][3];
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = input.nextDouble();
            }
        }

        System.out.println("Multiplication of the matrices is: ");
        double[][] multi = multiplyMatrix(arr1, arr2);
        for (int row = 0; row < multi.length; row++) {
            for (int col = 0; col < multi[row].length; col++) {
                System.out.printf("%.1f%s", multi[row][col], " ");
            }
            System.out.println();
        }
    }
}