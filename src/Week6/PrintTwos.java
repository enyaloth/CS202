package Week6;

public class PrintTwos {
    public static void print(int n) {
        if (n<1) {
            throw new IllegalArgumentException("Error: n must be greater than 1: " + n);
        }
        else if (n%4==0) {
            System.out.print("2 * ");
            print(n/4);
            System.out.print(" * 2");
        }
        else if (n%2==0) {
            System.out.print("2 * " + n / 2);
        }
        else {
            System.out.print(n);
        }

    }

    public static void main(String[] args) {
        System.out.println();
        print(80);
        System.out.println();
        print(96);
        System.out.println();
        print(2);
        System.out.println();
        print(1);
        System.out.println();
    }
}
