// Tae Kim, CSE 114, Section1, Lab22_1, April 26, 2023
public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalTriangleException("Invalid triangle");
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }
}
class IllegalTriangleException extends Exception {
    String str;
    public IllegalTriangleException() {}
    public IllegalTriangleException(String str) {
        super(str);
    }
}
class TestTriangle {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(1, 3, 1);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex);
        }
    }
}
