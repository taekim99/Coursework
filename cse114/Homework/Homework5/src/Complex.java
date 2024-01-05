// Tae Kim, 115331743, problem 3_1
public class Complex {
    private double realPart;
    private double imaginaryPart;
    private double complexNumber;

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
        complexNumber = realPart + imaginaryPart * Math.sqrt(-1);
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
        complexNumber = realPart + imaginaryPart * Math.sqrt(-1);
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public static Complex addTwoComplex(Complex i, Complex j) {
        double cRealPartAdd = i.getRealPart() + j.getRealPart();
        double cImaginaryPartAdd = i.getImaginaryPart() + j.getImaginaryPart();
        return new Complex(cRealPartAdd, cImaginaryPartAdd);
    }

    public static Complex subtractTwoComplex(Complex i, Complex j) {
        double cRealPartSubtract = i.getRealPart() - j.getRealPart();
        double cImaginaryPartSubtract = i.getImaginaryPart() - j.getImaginaryPart();
        return new Complex(cRealPartSubtract, cImaginaryPartSubtract);
    }

    public String printComplex(double realPart, double imaginaryPart) {
        return "(" + realPart + ", " + imaginaryPart + ")";
    }
}