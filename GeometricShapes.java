import java.util.Scanner;

//Interface
interface Shape{
    double area();
    double perimeter();
}

//Circle Implementation
class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

// Rectangle implementation
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

// Triangle implementation
class Triangle implements Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        double s = perimeter() / 2;
        // Heron's formula
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

// Main Class
public class GeometricShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Circle
            System.out.print("Enter radius of Circle: ");
            double r = Double.parseDouble(sc.nextLine());
            Shape circle = new Circle(r);
            System.out.println("Circle Area: " + circle.area());
            System.out.println("Circle Perimeter: " + circle.perimeter());

            // Rectangle
            System.out.print("Enter length and width of Rectangle: ");
            double l = Double.parseDouble(sc.nextLine());
            double w = Double.parseDouble(sc.nextLine());
            Shape rectangle = new Rectangle(l, w);
            System.out.println("Rectangle Area: " + rectangle.area());
            System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

            // Triangle
            System.out.print("Enter three sides of Triangle: ");
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double c = Double.parseDouble(sc.nextLine());
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new ArithmeticException("Invalid triangle sides");
            }
            Shape triangle = new Triangle(a, b, c);
            System.out.println("Triangle Area: " + triangle.area());
            System.out.println("Triangle Perimeter: " + triangle.perimeter());

        } catch (NumberFormatException e) {
            System.out.println("Invalid number input! " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
