//WAP to design a class using abstract Methods and classes.
abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class rectangle extends Shape {
    private double length, width;

    rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
public class AbsMetCls{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new rectangle(4, 6);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}