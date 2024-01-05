// Tae Kim, CSE 114, Section1, Lab5_1, Feb 13, 2023
import java.util.Scanner;
public class Lab5_1{
    public static void main(String[] args) {
        // Prompt the user to enter a,b, and c
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        // Compute
        float r1 = (float)((-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a); // 0.5 를 1 /2 로 바꾸면 안된다!
        float r2 = (float)((-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a);

        // Display
        if (Math.pow(b, 2) - 4 * a * c < 0)
            System.out.println("The equation has no real roots");
        else if (Math.pow(b, 2) - 4 * a * c == 0)
            System.out.printf("%s%.1f","The equation has one root ", r1);
        else
            System.out.printf("%s%.6f%s%.5f","The equation has two roots ", r1, " and ", r2);
    }
}