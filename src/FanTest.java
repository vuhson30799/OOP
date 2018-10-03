public class FanTest {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

//        set fan1
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn();

//        set fan2
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");

//      fan1 status
        System.out.println("Fan1 status: ");
        fan1.toStringFan();

//      fan2 status
        System.out.println("Fan2 status: ");
        fan2.toStringFan();
    }
}
