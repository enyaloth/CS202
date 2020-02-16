package Week5;

import java.util.ArrayList;

public class AssetMain {
    public static void main(String[] args) {
        Stock divStock2 = new DivStock("MSFT", 100,171,180, 10);
        DivStock divStock1 = new DivStock("TSLA", 200,150,19,120);
        Cash cash1 = new Cash(55.0);

        //Put the stocks into an ArrayList
        //We can use an ArrayList to process objects
        ArrayList<Asset> assetArrayList = new ArrayList<>();
        //Stock stock1 = new Stock("MSFT", 100,171,180);
        assetArrayList.add(divStock1);
        assetArrayList.add(divStock2);
        assetArrayList.add(cash1);

        for (Asset s: assetArrayList) {
            System.out.println(s);
        }

    }
}
