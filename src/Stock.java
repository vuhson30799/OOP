public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double presentPrice;
    public Stock (String symbol, String name) {
        this.name = name;
        this.symbol = symbol;
    }
    public Stock (double previousClosingPrice, double presentPrice) {
        this.presentPrice = presentPrice;
        this.previousClosingPrice = previousClosingPrice;
    }
    double getChangePercent () {
        return Math.abs(presentPrice - previousClosingPrice) / presentPrice * 100;
    }
}
