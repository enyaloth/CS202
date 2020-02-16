package Week5;

public class DivStock extends Stock {

    private double dividends = 0;

    @Override
    public double calcValue(double initialValue) {
        return 0;
    }



    // initializes the class
    public DivStock(String symbol, int shares, double bPrice, double sPrice, double dividends) {
        super(symbol, shares, bPrice, sPrice);
        this.dividends = dividends;
    }
    // getters
    public double getDividends() {
        return dividends;
    }

    // abstract method made concrete
    @Override
    public double calcProfit() {
        return getShares() * (getSellPrice()-getBuyPrice());
    }

    @Override
    public String toString() {
        return super.toString() + calcProfit() + " Dividends: " + getDividends();
    }
}
