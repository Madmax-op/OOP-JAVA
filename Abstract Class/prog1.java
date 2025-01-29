abstract class Student {
int rollNo;
String regNo;
public void getInput(int rollNo, String regNo) {
this.rollNo = rollNo;
this.regNo = regNo;
}
abstract String course();
}
class Kiitian extends Student {
String course() {
return "B.Tech. (Computer Science & Communication Engg)";
}
public void displayDetails() {
System.out.println("Rollno - " + rollNo);
System.out.println("Registration no - " + regNo);
System.out.println("Course - " + course());
}
}
public class prog1 {
public static void main(String[] args) {
Kiitian k = new Kiitian();
k.getInput(2329163, "1234567890");
k.displayDetails();
}
}
