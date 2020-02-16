package Week5;

public class Cash implements Asset {
    private double initialValue;

    Cash(double initialValue) {
        this.initialValue = initialValue;
    }

    public double calcValue(double intialValue) {
        return intialValue;
    }

    @Override
    public double calcProfit() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cash Value: $" + initialValue;
    }
}
