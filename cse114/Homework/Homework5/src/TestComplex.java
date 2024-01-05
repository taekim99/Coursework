// Tae Kim, 115331743, problem 3_2
import java.util.Scanner;
public class TestComplex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter real part of the first complex number: ");
        int firstReal = input.nextInt();
        System.out.print("Enter imaginary part of the first complex number: ");
        int firstImaginary = input.nextInt();
        System.out.print("Enter real part of the second complex number: ");
        int secondReal = input.nextInt();
        System.out.print("Enter imaginary part of the second complex number: ");
        int secondImaginary = input.nextInt();

        Complex c1 = new Complex(firstReal, firstImaginary);
        Complex c2 = new Complex(secondReal, secondImaginary);

        System.out.print("First complex number is: " + c1.printComplex(c1.getRealPart(), c1.getImaginaryPart()));
        System.out.print("\nSecond complex number is: " + c2.printComplex(c2.getRealPart(), c2.getImaginaryPart()));

        Complex add = Complex.addTwoComplex(c1, c2);
        Complex subtract = Complex.subtractTwoComplex(c1, c2);
        System.out.println("\nAddition of the first complex number is: " + add.printComplex(add.getRealPart(), add.getImaginaryPart()));
        System.out.println("Subtraction of the first complex number is: " + subtract.printComplex(subtract.getRealPart(), subtract.getImaginaryPart()));

    }
}
