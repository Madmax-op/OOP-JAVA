import java.util.*;
class Shape {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    public double area(int side) {
        return side * side;
    }
}
public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        
        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice (1/2/3): ");
        
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                double circleArea = shape.area(radius);
                System.out.println("The area of the circle is: " + circleArea);
            }
            case 2 -> {
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                double triangleArea = shape.area(base, height);
                System.out.println("The area of the triangle is: " + triangleArea);
            }
            case 3 -> {
                System.out.print("Enter the side of the square: ");
                int side = sc.nextInt();
                double squareArea = shape.area(side);
                System.out.println("The area of the square is: " + squareArea);
            }
            default -> System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }
    }
}
