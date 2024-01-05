// Tae Kim, CSE 114, Section1, Lab23_1, May 1, 2023
public class Square extends GeometricObject implements Colorable {
    private double side;
    public Square() {}
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
    public void howToColor() {
        if (isFilled())
            System.out.println("it is already colored");
        else
            System.out.println("Colorable. Just fill it");
    }
}
class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[5];
        arr[0] = new Square("red", true, 1);
        arr[1] = new Square("orange", false, 2);
        arr[2] = new Square("yellow", true, 3);
        arr[3] = new Square("green", false, 4);
        arr[4] = new Square("blue", true, 5);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("obj " + i);
            ((Colorable)arr[i]).howToColor();
            System.out.println();
        }
    }
}
