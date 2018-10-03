public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn() {
        this.on = true;
    }

    public void toStringFan (){
        if (on) {
            System.out.println("Fan is ON: ");
            System.out.println("The speed: " + getSpeed());
            System.out.println("The Color: " + getColor());
            System.out.println("The radius: " + getRadius());
        }else {
            System.out.println("Fan is off");
            System.out.println("The Color: " + getColor());
            System.out.println("The radius: " + getRadius());

        }
    }
}
