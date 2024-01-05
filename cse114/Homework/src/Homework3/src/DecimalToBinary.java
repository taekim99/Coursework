package Homework3.src;// Tae Kim, 115331743, problem 4
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        String binary = dec2Bin(decimal);
        System.out.println("Binary equivalent: " + binary);
    }

    public static String dec2Bin(int n) {
        if (n == 0) {
            return "0";
        }
        String binary = "";
        while (n > 0) {
            int bit = n % 2;
            binary = bit + binary;
            n /= 2;
        }
        return binary;
    }
}
