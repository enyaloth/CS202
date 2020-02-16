package Week4.Inheritance;

public class AdvanceTicket implements Ticket {
    protected boolean advancedDays = false;


    public int Ticket(int number) {
        return number;
    }

    public boolean purchaseDate(int daysTilEvent) {
        if (daysTilEvent >= 10) advancedDays = true;
        else advancedDays = false;
        return advancedDays;
    }

    public double getPrice() {
        if (advancedDays) { return 30.0; }
        else return 40.;
    }

    @Override
    public String toString() {
        return "Number: " + Ticket(number) + ", Price: " + getPrice();
    }
}
