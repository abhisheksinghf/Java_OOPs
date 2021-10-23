abstract class A1{
    int a = 10;
    int b = 20;
    void sayHii(){
        System.out.println("Hii ! ");
    }
    abstract public int sum();
    abstract public void greet();
}
class A2 extends A1{
    public int sum(){
        return a+b;
    }
    public void greet(){
        System.out.println("Good Morning !");
    }
}
public class Abstract01{
    public static void main(String[] args) {
        // A1 a = new A1();
        A2 a = new A2();
        // a.sum();
        a.hashCode();
        System.out.println(a.sum());
    }
}