package Week4.Inheritance;

//Ham > Lamb > Yam > Spam

public class Ham {
    public void a() {
        System.out.println("Ham a");
        b();
    }
    public void b() {
        System.out.println("Ham b");
    }
    public String toString() {
        return "Ham";
    }
}
