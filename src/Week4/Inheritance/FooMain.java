//* Christina Parkhurst - Foo Bar Baz - 1/30/20 *//

package Week4.Inheritance;

public class FooMain {
    public static void main(String[] args) {
        Foo var1 = new Baz();
        Object var2 = new Mumble();

        ((Baz) var1).method1();
//        ((Bar) var1).method1();
        ((Foo) var2).method2();
//        ((Bar) var2).method2();
        ((Mumble) var2).method2();

//    Foo[] pity = {new Baz(), new Bar(), new Mumble(), new Foo()};
//    for (int i = 0; i < pity.length; i++) {
//        System.out.println(pity[i]);
//        pity[i].method1();
//        pity[i].method2();
//        System.out.println();

    }
}
