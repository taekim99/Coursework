// Tae Kim, 115331743, problem 4_1
public class Rational {
    private int numerator;
    private int denominator;
    public Rational() {
        this(1, 1);
    }
    public Rational(int numerator, int denominator) {
        // Find the smaller value
        int small;
        if (numerator > denominator)
            small = denominator;
        else
            small = numerator;

        // Find the great common divisor
        int gcd = 1;
        for (int i = 2; i <= small; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }

        // Assign the reduced form to variables of this class
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    public static Rational addTwoRational(int numerator1, int denominator1, int numerator2, int denominator2) {
        int denominator = denominator1 * denominator2;
        int numerator = numerator1 * denominator2 + numerator2 * denominator1;
        return new Rational(numerator, denominator);
    }
    public static Rational subtractTwoRational(int numerator1, int denominator1, int numerator2, int denominator2) {
        int denominator = denominator1 * denominator2;
        int numerator = numerator1 * denominator2 - numerator2 * denominator1;
        return new Rational(numerator, denominator);
    }
    public static Rational multiplyTwoRational(int numerator1, int denominator1, int numerator2, int denominator2) {
        int denominator = denominator1 * denominator2;
        int numerator = numerator1 * numerator2;
        return new Rational(numerator, denominator);
    }
    public static Rational devideTwoRational(int numerator1, int denominator1, int numerator2, int denominator2) {
        int denominator = denominator1 * numerator2;
        int numerator = numerator1 * denominator2;
        return new Rational(numerator, denominator);
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
