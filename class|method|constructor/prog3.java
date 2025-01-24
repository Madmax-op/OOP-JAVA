import java.util.*;
class Student{
int roll;
String name;
double cgpa;
public Student(int roll, String name, double cgpa){
this.roll=roll;
this.name=name;
this.cgpa=cgpa;
}
public void details(){
System.out.println("Roll: "+roll+"Name: "+name+"CGPA: "+cgpa);
}
}
public class prog3 {
public static void main (String a[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the No. of Students: ");
int n= sc.nextInt();
Student []students= new Student[n];
for (int i = 0; i < n; i++) {
System.out.println("\nEnter details for student " + (i + 1) + ":");
System.out.print("Enter roll number: ");
int roll = sc.nextInt();
sc.nextLine(); 
System.out.print("Enter name: ");
String name = sc.nextLine();
System.out.print("Enter CGPA: ");
double cgpa = sc.nextDouble();
students[i] = new Student(roll,name,cgpa);
}
System.out.println("\nDetails of all students:");
for (int i = 0; i < n; i++) {
students[i].details();
}
}
}
