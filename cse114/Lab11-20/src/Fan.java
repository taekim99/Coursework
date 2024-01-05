// Tae Kim, CSE 114, Section1, Lab16_2, April 3, 2023
public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = 1;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return speed + " " + color + " " + radius;
        } else {
            return color + " " + radius + " fan is off";
        }
    }
}