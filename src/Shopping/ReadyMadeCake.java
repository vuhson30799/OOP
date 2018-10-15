package Shopping;

import java.util.Scanner;

public class ReadyMadeCake extends Cake{
    private int quantity;


    public int getQuantity() {
        return quantity;
    }

    public ReadyMadeCake (String name, double rate, int quantity) {
        super(name, rate);
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return rate * quantity;
    }

    @Override
    public int getDiscount() {
        if (quantity > 5) {
            return 20;
        }
        return 0;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\t" + quantity +"cakes";
    }

}
