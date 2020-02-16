package Week4.Shapes;

public class Triangle implements Shapes.Shape {
    private double height;
    private double base;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return .5*base*height;
    }
    public double perimeter() {
        return base+2*(Math.sqrt((.5*base*.5*base)+(height*height)));
    }
}
