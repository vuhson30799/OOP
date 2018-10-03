package Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

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
    public double getPeramiter (){
        return Math.PI * 2 * radius;
    }
    public double getArea () {
        return Math.PI * Math.pow(radius,2);
    }
    @Override
    public String toString () {
        return "This is circle with color: " + color +" radius: " + radius;
    }

}
