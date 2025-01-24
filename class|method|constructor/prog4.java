class Calculator {
public int subtract(int a, int b) {
return a - b;
}
public double subtract(double a, double b) {
return a - b;
}
public int subtract(int a, int b, int c) {
 return a - b - c;
}
public double subtract(double a, int b) {
return a - b;
}
}
public class prog4 {
public static void main(String[] args) {
Calculator calculator = new Calculator();
System.out.println("Subtracting two integers: " + calculator.subtract(5, 3));
System.out.println("Subtracting two doubles : " + calculator.subtract(20.5, 6.8));
System.out.println("Subtracting three integers: " + calculator.subtract(12,3,5));
System.out.println("Subtracting one double and one integer : " + calculator.subtract(50.8,30));
}
}
