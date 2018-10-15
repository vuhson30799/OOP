package Shopping;

public class OrderCake extends Cake {
    private  double weight;
    public OrderCake (String name, double rate, double weight) {
        super(name,rate);
        this.weight = weight;
    }
    public String toString () {
        return super.toString() + "\t" + weight + "kg";
    }


    @Override
    public double getPrice() {
        return rate * weight;
    }

    @Override
    public int getDiscount() {
        if (weight > 1) {
            return 20;
        }
        return 0;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + "\t" + weight + "kg";
    }
}
