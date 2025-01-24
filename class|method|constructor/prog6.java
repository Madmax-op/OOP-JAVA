import java.util.*;

class Rectangle {
    double length;
    double breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("The area of the rectangle is: " + calculateArea());
    }
}

public class prog6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default constructor:");
        defaultRectangle.displayArea();

        System.out.println("\nEnter the length and breadth of the rectangle:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Breadth: ");
        double breadth = scanner.nextDouble();

        Rectangle parameterizedRectangle = new Rectangle(length, breadth);
        System.out.println("Parameterized constructor:");
        parameterizedRectangle.displayArea();
    }
}
