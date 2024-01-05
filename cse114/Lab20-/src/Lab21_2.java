// Tae Kim, CSE 114, Section1, Lab21_2, April 24, 2023
import java.util.Scanner;
public class Lab21_2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int)(Math.random() * 100);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int index = input.nextInt();

        try {
            System.out.println("The corresponding element value is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }
}
