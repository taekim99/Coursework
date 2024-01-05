// Tae Kim, 115331743, problem 4_2
import java.util.Scanner;
public class TestRational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numerator for the first rational number: ");
        int firstNumerator = input.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int firstDenominator = input.nextInt();
        System.out.print("Enter numerator for the second rational number: ");
        int secondNumerator = input.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        int secondDenominator = input.nextInt();

        Rational first = new Rational(firstNumerator, firstDenominator);
        Rational second = new Rational(secondNumerator, secondDenominator);
        Rational addition = Rational.addTwoRational(first.getNumerator(), first.getDenominator(), second.getNumerator(), second.getDenominator());
        Rational subtraction = Rational.subtractTwoRational(first.getNumerator(), first.getDenominator(), second.getNumerator(), second.getDenominator());
        Rational multiplication = Rational.multiplyTwoRational(first.getNumerator(), first.getDenominator(), second.getNumerator(), second.getDenominator());
        Rational division = Rational.devideTwoRational(first.getNumerator(), first.getDenominator(), second.getNumerator(), second.getDenominator());

        System.out.println("First rational number is: " + first);
        System.out.println("Second rational number is: " + second);
        System.out.println("Addition of the rational numbers is: " + addition);
        System.out.println("Subtraction of the rational numbers is: " + subtraction);
        System.out.println("Multiplication of the rational numbers is: " + multiplication);
        System.out.println("Division of the rational numbers is: " + division);
    }
}
