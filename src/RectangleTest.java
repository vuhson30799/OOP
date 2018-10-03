public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,10);
        rectangle.display();
        System.out.println("The Perimeter Of This Rectangle is: " + rectangle.getPerimeter());
        System.out.println("THe Area Of This Rectangle is: " + rectangle.getArea());
    }
}
