package Circle;

public class Circle {
    private double radius;
    private String color;

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

}
