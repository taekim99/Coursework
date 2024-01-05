// Tae Kim, 115331743, problem 5_1
public class Circle2D {
    private double x;
    private double y;
    private double radius;
    public Circle2D() {
        this(0, 0, 1);
    }
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x, double y) {
        if (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) > this.radius)
            return false;
        else
            return true;
    }
    public boolean contains(Circle2D circle) {
        if (Math.sqrt(Math.pow(circle.x, 2) + Math.pow(circle.y, 2) + circle.radius) > this.radius)
            return false;
        else
            return true;
    }
    public boolean overlaps(Circle2D circle) {
        if (Math.sqrt(Math.pow(circle.x, 2) + Math.pow(circle.y, 2)) - circle.radius > this.radius)
            return false;
        else
            return true;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }
}