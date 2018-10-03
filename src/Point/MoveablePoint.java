package Point;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint (float x, float y, float xSpeed, float ySpeed) {
        super (x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint () {}

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public float[] getSpeed () {
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }
    public MoveablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
    public String toString () {
        return super.toString() + "," + "speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
