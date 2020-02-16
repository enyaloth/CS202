package Week5;

public abstract class Stock implements Asset {
    private String symbol;
    private int shares;
    private double buyPrice;
    public double sellPrice;

    // initializes the class
    public Stock(String symbol, int shares, double buyPrice, double sellPrice) {
        this.symbol = symbol;
        this.shares = shares;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public int getShares() {
        return shares;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toString() {
        return ("Symbol: " + symbol + " Purchase Price: $" + buyPrice + " Current Value: $" + sellPrice + " P/L: $");
    }
}
