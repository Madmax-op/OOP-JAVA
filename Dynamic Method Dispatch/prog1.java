class Apple{
void show(){
System.out.println("In Apple");
}
}
class Banana extends Apple{
void show(){
System.out.println("In Banana");
}
}
class Cherry extends Apple{
void show(){
System.out.println("In Cherry");
}
}
public class prog3 {
public static void main (String a[])
{
Apple a1= new Apple();
a1.show();

a1= new Banana();
a1.show();

a1= new Cherry();
a1.show();
}
}
