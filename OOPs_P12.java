class Hello{
    {
        show();
    }
    Hello(){
        System.out.println("Hello ! I am a constructor ");
        show();
    }
    void show(){
        System.out.println("Hello ! I am Hello class Method");
    }
}
class Hi extends Hello{
    Hi(){
        System.out.println("Hii ! I am a Constructor ");
    }
    void show(){//Override show method
        System.out.println("Hello ! I am Hii class Method");
    }
}
public class OOPs_P12{
    public static void main(String[] args) {
        Hi h1 = new Hi();
        Hello h2 = new Hello();
        // h1.show();       
        h2.show();
    }
}