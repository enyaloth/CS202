/* Christina Parkhurst - CS 202 - Pet - 1/22/20 */
package Week3;

public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(int age) {
        return age;
    }

    public void printInfo() {
        System.out.println("Name: " + getName() + ", Age: " + getAge(age));
    }
}
