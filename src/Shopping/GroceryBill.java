package Shopping;

import java.util.Date;

public class GroceryBill {
    private Date dateOfOrder;

    private int index = 0;
    public Item[] items = new Item[10];

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public int getIndex() {
        return index;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public GroceryBill (Customer customer, Date dateOfOrder){
        this.customer = customer;
        this.dateOfOrder = dateOfOrder;
    }

    public void add (Item item) {
        if (index < items.length){
            items[index] = item;
            index ++;
        }else{
            System.out.println("item's quantity is limited at " + items.length);
        }
    }

    public double getTotal (){
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public void printReceipt () {
        System.out.println(getDateOfOrder());
        System.out.println(getCustomer().getInfo());
        for (int i = 0; i < index; i++) {
            System.out.println(items[i].getInfo());
        }
        System.out.println("Total: " + getTotal());

        //print discount bill
        System.out.println("Customer is not preferred ");
    }
}
