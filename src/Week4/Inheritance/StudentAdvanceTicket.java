package Week4.Inheritance;

public class StudentAdvanceTicket extends AdvanceTicket {
    @Override
    public double getPrice() {
        return (super.getPrice()/2.0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
