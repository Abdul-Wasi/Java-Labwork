import java.util.Scanner;

class Rectangle {
    float length;
    float width;

    // Method to accept dimensions
    public void getDimensions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter width of the rectangle: ");
        width = sc.nextFloat();
    }

    // Method to calculate area
    public float calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public float calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display area and perimeter
    public void display() {
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
}

class RectangleSystem {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        rect.getDimensions();
        rect.display();
    }
}
