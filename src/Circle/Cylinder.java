package Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder (double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea (){
        return getPeramiter() * height + 2 * super.getArea();
    }
    public String toString (){
        return "This is Cylinder with color: " + getColor() + " radius: " + getRadius() + " height: " + height;
    }
}
