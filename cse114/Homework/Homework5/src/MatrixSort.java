// Tae Kim, 115331743, problem 2
import java.util.Scanner;
public class MatrixSort {
    public static void main(String[] args) {
        double[][] arr = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextDouble();
            }
        }

        System.out.println("\nThe row sorted array is ");
        double[][] n = sortRows(arr);
        for (int row = 0; row < n.length; row++) {
            for (int col = 0; col < n[row].length; col++) {
                System.out.print(n[row][col] + " ");
            }
            System.out.println();
        }
    }



    // Copying 2 dimensional array
    public static double[][] sortRows(double[][] m) {
        double[][] n = new double[m.length][];
        for (int row = 0; row < m.length; row++) {
            n[row] = new double[m[row].length];
            for (int col = 0; col < m[row].length; col++) {
                n[row][col] = m[row][col];
            }
        }

        for (int row = 0; row < n.length; row++) {
            boolean bubbleSort = true;
            while (bubbleSort) {
                bubbleSort = false;
                for (int col = 0; col < n[row].length - 1; col++) {
                    if (n[row][col] > n[row][col + 1]) {
                        double tempt = n[row][col];
                        n[row][col] = n[row][col + 1];
                        n[row][col + 1] = tempt;
                        bubbleSort = true;
                    }
                }
            }
        }

        return n;
    }
}