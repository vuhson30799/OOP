package Shopping;

import java.util.Date;
import java.util.Scanner;

public class Shopping {
    /*static {
        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer("Peter","08 Tran Quang Khai","0123456789");

        Customer customer2 = new Customer("Tom","54 Nguyen Luong Bang","05113922967");

        GroceryBill[] billForCustomer = new GroceryBill[2];

        billForCustomer[0] = new DiscountBill(customer1, new Date(),true);

        billForCustomer[1] = new DiscountBill(customer2,new Date(),false);

    }*/
    public static Scanner scanner = new Scanner(System.in);

   /* public static Customer customer1 = new Customer("Peter","08 Tran Quang Khai","0123456789");

    public static Customer customer2 = new Customer("Tom","54 Nguyen Luong Bang","05113922967");*/

    public static Customer[] customers = new Customer[2];

    public static GroceryBill[] billForCustomers = new GroceryBill[2];

   /* public static GroceryBill billForCustomer1 = new DiscountBill(customer1, new Date(),true);

    public static GroceryBill billForCustomer2 = new DiscountBill(customer2,new Date(),false);*/

    public static void main(String[] args) {
        customers[0] = new Customer("Peter","08 Tran Quang Khai","0123456789");
        billForCustomers[0] = new DiscountBill(customers[0], new Date(),true);
       /* System.out.println("Hello: " + customer1.getName());
        runMenu();
        System.out.println("Your receipt: ");
        billForCustomer1.printReceipt();*/

        billForCustomers[1] = new DiscountBill(customers[1],new Date(),false);
        System.out.println("Hello: " + customers[1].getName());
        runMenu(billForCustomers[1]);
        System.out.println("Your receipt: ");
        billForCustomers[1].printReceipt();
    }

    public static void runMenu (GroceryBill bill){
        do {
            menuForCustomer();
            String customerChoose = scanner.nextLine();
            if (customerChoose.equals("1") || customerChoose.equals("Shoe")){
                buyShoe(bill);
            }else if (customerChoose.equals("2") || customerChoose.equals("OrderCake")){
                buyOrderCake(bill);
            }else if (customerChoose.equals("3") || customerChoose.equals("ReadyMadeCake")){
                buyReadyMadeCake(bill);
            }else if (customerChoose.equals("4") || customerChoose.equals("Exit")){
                break;
            }else{
                System.out.println("Your choose isn't accepted!! Enter again");
            }
        }while (true)
                ;
    }

    private static void buyReadyMadeCake(GroceryBill bill) {
        System.out.println("input name of cake: ");
        String name = scanner.nextLine();
        System.out.println("input rate of cake: ");
        double rate = scanner.nextDouble();
        System.out.println("input quantity of cake: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        bill.add(new ReadyMadeCake(name,rate,quantity));
    }

    private static void buyOrderCake(GroceryBill bill) {
        System.out.println("enter cake's name: ");
        String name = scanner.nextLine();
        System.out.println("enter its rate: ");
        double rate = scanner.nextDouble();
        System.out.println("enter its weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        bill.add(new OrderCake(name, rate, weight));
    }

    private static void buyShoe(GroceryBill bill) {
        System.out.println("Enter shoe's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter shoe's size: ");
        int size = scanner.nextInt();
        System.out.println("enter shoe's price: ");
        double price = scanner.nextDouble();
        Shoe.ShoeType realType = null;
        do {
            scanner.nextLine();
            System.out.println("Enter shoe's type");
            String type = scanner.nextLine();

            if (type.equals("winter")){
                realType = Shoe.ShoeType.winter;
                break;
            }else if (type.equals("summer")){
                realType = Shoe.ShoeType.summer;
                break;
            }else {
                System.out.println("Error!! Enter again");
            }
        }while (true);
        bill.add(new Shoe(name,size,price,realType));
    }

    public static void menuForCustomer (){
        System.out.println("What do u want to buy? ");
        System.out.println("1.Shoe");
        System.out.println("2.OrderCake");
        System.out.println("3.ReadyMadeCake");
        System.out.println("4.Exit");

    }
}
