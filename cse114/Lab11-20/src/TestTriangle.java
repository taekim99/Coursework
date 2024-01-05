// Tae Kim, CSE 114, Section1, Lab17_1_3, April 5, 2023
public class TestTriangle {
    public static void main(String[] args) {
        Triangle tri = new Triangle(1, 1.5, 1, "yellow", true);
        System.out.println("The area of the triangle: " + tri.getArea());
        System.out.println("The perimeter of the triangle: " + (tri.getSide1() + tri.getSide2() + tri.getSide3()));
        System.out.println(tri);
    }
}
