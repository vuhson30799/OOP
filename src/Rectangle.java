public class Rectangle {
    double width = 0, height = 0;
    public Rectangle (){

    }
    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea (){
        return width * height;
    }
    public double getPerimeter (){
        return 2 * (width + height);
    }
    public void display (){
        System.out.println(" Rectangle{" + "width: " + width + ";" + "height: " + height);
    }
}
