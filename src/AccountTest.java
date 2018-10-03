public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        account.setAnnualInterrestRate(4.5 / 100);
        double withdrawMoney = account.withdraw(2500);
        if ( withdrawMoney == -1) {
            System.out.println("Loi ko du tien rut");
        }else{
            System.out.println("so tien rut dc la:" + withdrawMoney);
        }
        System.out.println("Balance Of This Account After Withdrawing : " + account.getBalance());
        System.out.println("The Monthly Interest: " + account.getMonthlyInterest());
        double depositMoney = account.deposit(3000);
        System.out.println("So tien rut dc la: " + depositMoney);
        System.out.println("Balance Of This Account After Depositing: " + account.getBalance());
        System.out.println("The Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("The Created Account Date: " + account.getDateCreated());
    }
}
