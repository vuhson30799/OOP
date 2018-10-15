package Shopping;

import java.util.Date;

public class Shoe extends Item {
    private int size;
    public enum ShoeType {
        winter, summer
    }
    private double price;
    private String name;
    private int discount = 10;
    private ShoeType type;

    public Shoe (String name, int size, double price, ShoeType type){
        this.name = name;
        this.price = price;
        this.size = size;
        this.type = type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    // Undefined
    public int getDiscount() {
        return 0;
    }

    public int getDiscount(Customer customer) {
        ShoeType season = null;
        Date dateBuyingShoe = customer.getDateCreateCustomer();
        int monthBuyingShoe = dateBuyingShoe.getMonth() + 1;
        if (monthBuyingShoe >= 5 && monthBuyingShoe <= 8) {
            season = ShoeType.summer;
        }else if (monthBuyingShoe >= 10 || monthBuyingShoe <= 1) {
            season = ShoeType.winter;
        }
        if (type != season && season != null){
            return discount;
        }
        return 0;
    }

    @Override
    public String getInfo() {
        return "Shoe: " + name
                + " size: " + size
                + " price: " + price;
    }
}
