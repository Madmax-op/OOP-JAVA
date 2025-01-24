import java.util.*;
class Box {
    double length, width, height;
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double volume() {
        return length * width * height;
    }
}
public class prog1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the box: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the box: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of the box: ");
        double height = sc.nextDouble();
        Box b1 = new Box(length, width, height);
        double volume = b1.volume();
        System.out.println("The volume of the box is: " + volume);
    }
}
