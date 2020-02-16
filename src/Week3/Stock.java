/* Christina Parkhurst - CS202 - Stock - 1/22/20 */
package Week3;

public class Stock {
    private String symbols;
    private int totalShares;
    private double totalCost;
    private double initialPrice;

    public Stock(String symbols, int totalShares, double totalCost) {
        this.symbols = symbols;
        this.totalShares = totalShares;
        this.totalCost = totalCost;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public String getSymbols() {
        return symbols;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getTotalShares() { return totalShares; }

    public double purchase(double currentPrice, int sharesPurchased) {
        double purchase = currentPrice*sharesPurchased;
        return purchase;
    }

    public void printInfo() {
        System.out.print(getSymbols() + " ");
        System.out.println("Purchase price: $" + getInitialPrice() +
                ", Current Price:  $" + getTotalCost());
        System.out.println("Total shares: " + totalShares + ", Total Cost: $"
                + purchase(getTotalCost(),getTotalShares()));
        if (getTotalCost() > initialPrice) {
            System.out.println("Profit: $" + (double)Math.round((totalShares*
                    (getTotalCost()-initialPrice))*100.00)/100.00);
        }
        else if (initialPrice > getTotalCost()) {
            System.out.println("Loss: $" + (double)Math.round((totalShares*
                    (initialPrice-getTotalCost()))*100.00)/100.00);
        }
        else System.out.println("No change.");
    }
}
