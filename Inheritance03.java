//hierarchial inheritance 
class A{
    void methodA(){
        System.out.println("Method of class A ! ");
    }
}
class B extends A{
    void methodB(){
        System.out.println("Method of class B");
    }
}
class C extends A{
    void methodC(){
        System.out.println("Method of class C");
    }
}
class D extends A{
    void methodD(){
        System.out.println("Method of class D");
    }
}
public class Inheritance03 {
    public static void main(String[] args) {
    B x = new B();
    x.methodA();
    x.methodB();
    // x.methodC(); cannot access 

    }
}
