class A{
    int a = 20;
}
class B extends A{
    int a = 40;
}
public class OOPs_P10 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.a);
        System.out.println(b.a);
    }
}
