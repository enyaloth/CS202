package Week3;

public class PetMain {
    public static void main(String[] args) {
        Dog shaggy = new Dog("Shaggy", 10, "Medium", "Lhasapoo");
        shaggy.printInfo();
        System.out.println();

        Cat velcro = new Cat("Velcro", 1, "Small", "Orange Tabby");
        velcro.printInfo();
        System.out.println();

        Cat duckie = new Cat("Duckie", 1, "Small", "Diluted Calico");
        duckie.printInfo();
    }
}
