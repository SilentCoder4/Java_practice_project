// Parent class: Rectangle
class Rectangle {
    protected double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Rectangle -> Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Box extends Rectangle {
    private double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double calculateVolume() {
        return length * width * height;
    }

    double calculateSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Box -> Height: " + height);
        System.out.println("Surface Area: " + calculateSurfaceArea());
        System.out.println("Volume: " + calculateVolume());
    }
}

// Main class
public class AreaPerimeter {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 3);
        rect.display();

        System.out.println();


        Box box = new Box(5, 3, 4);
        box.display();
    }
}
