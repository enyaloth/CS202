package Week3;

public class StockMain {
    public static void main(String[] args) {
        Stock me = new Stock("NCS",1652,.58);
        me.setInitialPrice(.55);
        me.purchase(me.getTotalCost(), me.getTotalShares());
        me.printInfo();

    }
}
