package Week6;

public class RecursiveTracing {
    public static void mystery(int n) {
        if (n<0) {
            mystery(n-1);
        }
        else if (n<10) {
            System.out.print(n);
        }
        else {
            mystery(n/10);
            int digit = n%10;
            System.out.print(", " + digit%3);
        }
    }

    public static void main(String[] args) {
        mystery(10);
        mystery(101);
        mystery(849);
        mystery(-1001);
        mystery(800203);
    }
}
