package Shopping;

import java.util.Date;

public class Customer {
    private String name;

    private String address;

    private String phoneNumber;

    private Date dateCreateCustomer;

    public Date getDateCreateCustomer() {
        return dateCreateCustomer;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Customer (String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        dateCreateCustomer = new Date();
    }

    public String getInfo () {
        return "Customer: " + getName()
                + " Address: " + getAddress()
                + " Phone Number: " + getPhoneNumber();
    }
}
