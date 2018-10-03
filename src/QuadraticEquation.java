public class QuadraticEquation {
    private double a, b, c;
   /* public static void test (){
        System.out.println();
        a = 3;
    }*/
    public QuadraticEquation (double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(b,2) - 4 * a * c;
    }
    public double getRoot1 (){
//        if (a == 0)  throw lỗi ntn?
        return 0;
    }
}
