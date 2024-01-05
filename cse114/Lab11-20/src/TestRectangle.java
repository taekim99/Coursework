// Tae Kim, CSE 114, Section1, Lab14, Mar 27, 2023
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(4);
        r1.setHeight(40);
        r1.setColor("red");

        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getColor());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        System.out.println();

        Rectangle r2 = new Rectangle();
        r2.setWidth(3.5);
        r2.setHeight(35.9);
        r2.setColor("red");

        System.out.println(r2.getWidth());
        System.out.println(r2.getHeight());
        System.out.println(r2.getColor());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}
