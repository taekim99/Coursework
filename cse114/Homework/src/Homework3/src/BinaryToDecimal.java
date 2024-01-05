package Homework3.src;// Tae Kim, 115331743, problem 5
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();

        int decimal = bin2Dec(binaryString);
        System.out.println("The decimal equivalent of " + binaryString + " is " + decimal);
    }

        public static int bin2Dec(String binaryString) {
        int decimal = 0;
        int power = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}