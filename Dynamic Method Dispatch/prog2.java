class A{
    public void show (){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show (){
        System.out.println("In B show");
    }
}
class C extends A{
    public void show (){
        System.out.println("In C show");
    }
}
public class demo56 {
    public static void main (String a[]){
        A a1= new A();
        a1.show();

        a1=new B();
        a1.show();

        a1=new C();
        a1.show();
    }
}
