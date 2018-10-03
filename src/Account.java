import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    public Account (){
        dateCreated = new Date(System.currentTimeMillis());
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date(System.currentTimeMillis());
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }
    public double getAnnualInterestRate (){
        return annualInterestRate;
    }
    public Date getDateCreated (){
        return dateCreated;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterrestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getMonthlyInterestRate (){
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest (){
        return balance * getMonthlyInterestRate();
    }
    public double withdraw (double money){
        if (balance < money) {
            return -1;
        }else {
            balance -= money;
            return money;
        }
    }
    public double deposit (double money) {
        balance += money;
        return money;
    }
}
