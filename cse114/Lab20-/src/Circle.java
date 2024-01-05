// Tae Kim, CSE 114, Section1, Lab23_2, May 1, 2023
public class Circle {
    private double radius;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "radius: " + radius;
    }
}
class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }
    public int compareTo(ComparableCircle c) {
        if (getArea() > c.getArea())
            return 1;
        else if (getArea() < c.getArea())
            return -1;
        else
            return 0;
    }
}
class TestCircle {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(10);
        System.out.println(c1.compareTo(c2));
    }
}