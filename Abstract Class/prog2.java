// Abstract Class with Anonymous Class
abstract class A{
    abstract public void show();
}
public class prog2{
    public static void main(String[] args) {
        A a=new A() 
        {
            public void show(){

                System.out.println("In abstract and anonymous class");
            }
        };
        a.show();
    }
}
