package Point;

public class Point {
    private float x = 0;
    private float y = 0;
    public Point (float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point () {};
    public float getX () {
        return x;
    }
    public float getY () {
        return y;
    }
    public void setX (float x) {
        this.x = x;
    }
    public void setY (float y) {
        this.y = y;
    }
    public void setXY (float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY () {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    @Override
    public String toString () {
        return "(" + x + "," + y + ")";
    }
}
