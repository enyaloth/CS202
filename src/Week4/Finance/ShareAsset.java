package Week4.Finance;

public abstract class ShareAsset implements Asset {
    // Define the private variables; encapsulation
    private String symbol;
    private double totalCost;
    private double currentPrice;
    public int totalShares;

    // constructor
    public ShareAsset(String symbol, double currentPrice, int totalShares) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        this.totalCost = 0;
        this.totalShares = totalShares;
    }

    // getters and setters (mutators and accessors)
    public void addCost(double cost) {
        totalCost += cost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getProfit() {
        // call abstract getMarketValue method - impemented
        // by the subclass.
        return getMarketValue() - getTotalCost();
    }

    // returns market value of the asset. (which is ??)
    public abstract double getMarketValue();
}
