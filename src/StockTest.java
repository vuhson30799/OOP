public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation");
        Stock stockPrice = new Stock(34.5,34.35);
        double changepercent = stockPrice.getChangePercent();
        System.out.println("The Change Percent is: " + changepercent);
    }
}
