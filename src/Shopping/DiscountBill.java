package Shopping;

import java.util.Date;

public class DiscountBill extends GroceryBill {

    private boolean preferred;

    public DiscountBill (Customer customer, Date dateOfOrder,boolean preferred){
        super(customer,dateOfOrder);
        this.preferred = preferred;
    }

    public int getDiscountCount (){
        int count = 0;
        if (preferred) {

            for (int i = 0; i < super.getIndex(); i++) {
                if (super.items[i].getDiscount() != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean checkPreferred () {
        return preferred;
    }

    public double getDiscountAmount (){
        double totalDiscount = 0;
        if (preferred){
            for (int i = 0; i < super.getIndex(); i++) {
                totalDiscount += items[i].getPrice() * super.items[i].getDiscount() / 100;
            }
        }
        return totalDiscount;
    }

    public double getDiscountPercent () {
        double totalDiscountPercent = 0;
        if (preferred) {
                totalDiscountPercent = getDiscountAmount() / super.getTotal();
            }
         return totalDiscountPercent;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < super.getIndex(); i++) {
            total += items[i].getPrice();
        }
        return total - getDiscountAmount();
    }
    @Override
    public void printReceipt () {
        if (preferred){
            System.out.println(super.getDateOfOrder());
            System.out.println(getCustomer().getInfo());
            for (int i = 0; i < super.getIndex(); i++) {
                System.out.println(items[i].getInfo() + " discount: " + items[i].getDiscount());
            }
            System.out.println("Total: " + super.getTotal());

            System.out.println("Total with discount: " + getTotal());
        }else{
            super.printReceipt();
        }

    }
}
