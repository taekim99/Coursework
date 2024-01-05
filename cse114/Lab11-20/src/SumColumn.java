// Tae Kim, CSE 114, Section1, Lab12_2, Mar 20, 2023
import java.util.Scanner;
public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimensions of an n x m matrix: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] matrix = new int[n][m];


        System.out.println("Enter the matrix of " + n + " x " + m + ":");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        System.out.println("The sums of the columns are:");
        for (int col = 0; col < matrix[0].length; col++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][col];
            }
            System.out.print(total + " ");
        }
    }
}
