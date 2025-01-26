import java.util.*;
class Shape2D{
double length;
double width;
Shape2D(double length, double width){
this.length=length;
this.width=width;
}
public double calculateArea(){
return length*width;
}
public double calculateCost(){
double area= calculateArea();
return area*40;
}
}
class Shape3D extends Shape2D{
double height;
Shape3D(double length, double width, double height){
super(length,width);
this.height=height;
}
public double calculateArea(){
return length*width*height;
}
public double calculateCost(){
double area = calculateArea();
return area *60;
}
}
public class prog1{
public static void main (String a[]){
Scanner sc = new  Scanner (System.in);
System.out.println("Enter the shape type");
String shapeType =sc.nextLine();
if (shapeType.equalsIgnoreCase("2D")){
System.out.println("Enter the length");
double length=sc.nextDouble();
System.out.println("Enter the width");
double width=sc.nextDouble();

Shape2D sheet = new Shape2D(length,width);
System.out.println("Cost of the 2D shape plastic is :"+ sheet.calculateCost());
}
else if (shapeType.equalsIgnoreCase("3D")){
System.out.println("Enter the length:");
double length=sc.nextDouble();
System.out.println("Enter the width:");
double width=sc.nextDouble();
System.out.println("Enter the height:");
double height=sc.nextDouble();

Shape3D box= new Shape3D(length,width,height);
System.out.println("Cost of the 3D shape plastic is :"+ box.calculateCost());
}
else {
System.out.println("Invalid Choice");
}
}
}
