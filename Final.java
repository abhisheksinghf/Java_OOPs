//finalizing methods,classes and variables
class c1{
final int a = 20;
int b = 30;
    void sayHii(){
        System.o
        ut.println("Hii !");
    }
    final void iAmFinal(){
        System.out.println("I am Final Method ! ");
    }
}
final class c2{
    c2(){
        System.out.println("I cannot be extended ! ");
    }
}
// class c3 extends c2{  //cannot be extended

// }
public class Final {
    public static void main(String[] args) {
    c1 c = new c1();
    // c.a = 10; //cannot be changed            
    c.b = 60;//valid
    c.sayHii();
    }
}
