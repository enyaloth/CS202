package Week4.Finance;

public class Stock extends ShareAsset {
    private int totalShares;

    // Constructor
    public Stock(String symbol, double currentPrice, int totalShares) {
        super(symbol, currentPrice, totalShares);
    }

    // Getters and setters
    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public int getTotalShares() {
        return totalShares;
    }

    // complete the interface methods
    public double getMarketValue() {
        return getTotalShares()*getCurrentPrice();
    }

    // complete the interface getProfit which will override super
    public double getProfit() {
        return getMarketValue()-getTotalCost();
    }
}
