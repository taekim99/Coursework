// Tae Kim, CSE 114, Section1, Lab10_2, Mar 1, 2023
import java.util.Scanner;
public class PatternDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows do you want? ");
        int row = input.nextInt();

        displayPattern(row);
    }

    public static void displayPattern(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = i ; j < n ; j++) {
                System.out.printf("%5s", "");
            }
            for (int a = i ; a > 0 ; a--) {
                System.out.printf("%5d", a);
            }
            System.out.println();
        }
    }
}
