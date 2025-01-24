import java.util.*;
class Rectangle{
double length,breadth;
public void read(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of rectangle: ");
length=sc.nextDouble();
System.out.println("Enter the Breadth of rectangle: ");
breadth=sc.nextDouble();
}
public void calculate(){
double area=length*breadth;
double perimeter=2*(length+breadth);
display(area,perimeter);
}	
public void display(double area, double perimeter){
System.out.println("The area of Rectangle is : " +area);
System.out.println("The perimeter of Rectangle is : " +perimeter);
}
}
public class prog2  {
public static void main (String a[]){
Rectangle r1 = new Rectangle();
r1.read();
r1.calculate();
}
}


