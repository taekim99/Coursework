package Homework2.src;// Tae Kim, 115331743, problem1
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        // Prompt the user to enter the line
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        // Compute using nested for loop and display
        for (int i = 0; i < lines; i++) {
            // left spaces
            for (int j = 1 ; j < lines - i ; j++) {
                System.out.printf("%-4s", "");
            }
            // left numbers
            for (int k = 0 ; k <= i ; k++) {
                System.out.printf("%-4d", (int)Math.pow(2, k));
            }
            // right numbers
            for (int a = i - 1 ; a >= 0 ; a--) {
                System.out.printf("%-4d", (int)Math.pow(2, a));
            }
            System.out.println();
        }
    }
}