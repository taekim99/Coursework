// Tae Kim, CSE 114, Section1, Lab21_1, April 24, 2023
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab21_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean again = true;
        while (again) {
            try {
                while (again) {
                    int a = (int)(Math.random() * 100);
                    int b = (int)(Math.random() * 100);
                    System.out.print(a + " + " + b + " = ");
                    int answer = input.nextInt();

                    if (a + b == answer) {
                        again = false;
                    } else
                        System.out.println("Incorrect answer. Try again.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Do it again.");
                String st = input.nextLine();
                System.out.println("Extra input:---> " + st);
            }
        }
        System.out.println("You are done!");
    }
}