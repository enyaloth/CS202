package Week4.Finance;

public class DivStock extends Stock {
    private double dividends;

    // constructor
    public DivStock(String symbol, double currentPrice, int totalShares) {
        super(symbol, currentPrice, totalShares);
        dividends = 0;
    }

    public double getMarketValue() {
        return super.getMarketValue() + dividends;
    }
    public void payDividend(double amountPerShare) {
        dividends += amountPerShare*getTotalShares();
    }
}
