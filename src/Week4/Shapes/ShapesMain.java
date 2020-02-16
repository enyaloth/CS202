//* Christina Parkhurst - Shapes - 1/30/20 *//
package Week4.Shapes;

public class ShapesMain {
    public static void main(String[] args) {
        double base = 5;
        double height = 3;
        double radius = 4;
        double length = 10;
        double width = 2;

        Triangle tri = new Triangle(base,height);
        Circle circ = new Circle(radius);
        Rectangle rect = new Rectangle(length,width);

        System.out.println("Triangle base "+ base + ", height " + height);
        System.out.print("Area: " + tri.area());
        System.out.println(" Perimeter: " + tri.perimeter()+ "\n");

        System.out.println("Circle radius " + radius);
        System.out.print("Area: " + circ.area());
        System.out.println(" Perimeter: " + circ.perimeter() + "\n");

        System.out.println("Rectangle length " + length + ", width " + width);
        System.out.print("Area: " + rect.area());
        System.out.println(" Perimeter: " + rect.perimeter()+ "\n");
    }
}
