package Week4.Inheritance;

public class TicketsMain {
    public static void main(String[] args) {
        Ticket t1 = new WalkupTicket();
        Ticket t2 = new StudentAdvanceTicket();
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
