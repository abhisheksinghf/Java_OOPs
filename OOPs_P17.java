class Parent{
    Parent(){
        System.out.println("This is a Parent class !");
    }
}
class Child1 extends Parent{
    Child1(){
        System.out.println("This is a child class !");
    }
}
public class OOPs_P17 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child1 c = new Child1();  
        Parent c1 = new Child1();
    }
}
