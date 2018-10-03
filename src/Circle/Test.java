package Circle;

import java.util.zip.CheckedOutputStream;

public class Test {
    public  int n = 0;
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.5,"blue", 5);
        System.out.println("The area of this cylinder is: " + cylinder.getArea());
        System.out.println(cylinder.toString());
        Circle circle = new Cylinder(3,"white",5);
        System.out.println(circle.toString());
    }
}
