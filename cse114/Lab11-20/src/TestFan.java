// Tae Kim, CSE 114, Section1, Lab16_2, April 3, 2023
public class TestFan {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(3);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);

        Fan f2 = new Fan();
        f2.setSpeed(2);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);

        System.out.println("The first object is: " + f1);
        System.out.println("The second object is: " + f2);
    }
}
