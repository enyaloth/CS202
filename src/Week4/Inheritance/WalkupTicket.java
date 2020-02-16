package Week4.Inheritance;

public class WalkupTicket implements Ticket {
    public int Ticket(int number) {
        return number;
    }

    @Override
    public double getPrice() {
        return 50.0;
    }

    @Override
    public String toString() {
        return "Number: " + Ticket(number) + ", Price: " + getPrice();
    }
}
