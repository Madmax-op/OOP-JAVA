import java.util.*;
class Plate {
double length;
double width;
public Plate(double length, double width) {
this.length = length;
this.width = width;
System.out.println("Length: " + length + ", Width: " + width);
}
}
class Box extends Plate {
double height;
public Box(double length, double width, double height) {
super(length, width); 
this.height = height;
System.out.println(" Length: " + length + ", Width: " + width + ", Height: " + height);
}
}
class Woodbox extends Box{
double thick;
public Woodbox(double length, double width, double height, double thick){
super(length,width,height);
this.thick=thick;
System.out.println(" Length: " + length + ", Width: " + width + ", Height: " + height + " Thick: " + thick);
}
}
public class prog2{
public static void main (String a[]){
Scanner sc= new Scanner (System.in);
System.out.println("Enter the length:");
double length= sc.nextDouble();
System.out.print("Enter width: ");
double width = sc.nextDouble();
System.out.print("Enter height: ");
double height = sc.nextDouble();
System.out.print("Enter thick : ");
double thick = sc.nextDouble();
WoodBox woodBox = new WoodBox(length, width, height, thickness);
}
}
