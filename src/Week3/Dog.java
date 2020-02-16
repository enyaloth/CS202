package Week3;

public class Dog extends Pet{
    private String size;
    private String breed;

    public Dog(String name, int age, String size, String breed) {
        super(name, age);
        this.size = size;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Breed: " + getBreed() + ", Size: " + getSize());
    }
}
