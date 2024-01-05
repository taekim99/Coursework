// Tae Kim, CSE 114, Section1, Lab14, Mar 27, 2023
class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() { // constructor - we use it to create an object.
        width = 1.0;
        height = 1.0;
        color = "white";
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
        color = "white";
    }

    public void setWidth(double width) { // method - we use it when we want to invoke some values
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width * 2 + height * 2;
    }
}
