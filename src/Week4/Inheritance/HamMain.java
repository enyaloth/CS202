//* Christina Parkhurst - Ham Spam Yam - 1/30/20 *//
package Week4.Inheritance;

public class HamMain {
    public static void main(String[] args) {
        Ham[] food = {new Ham(), new Lamb(), new Yam(), new Spam()};
        for (int i = 0; i < food.length; i++) {
            System.out.println("index: " + i);
            food[i].a();
            food[i].b();
            System.out.println(food[i].toString());
        }
    }
}
