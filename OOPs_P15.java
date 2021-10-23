//The super keyword in Java is a reference variable which is used to refer immediate parent class object.
//Usage of Java super Keyword
// super can be used to refer immediate parent class instance variable.
// super can be used to invoke immediate parent class method.
// super() can be used to invoke immediate parent class constructor
//1) super is used to refer immediate parent class instance variable.
// We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.
class Animall{
    String color = "Blue";
}
class Dog extends Animall{
    String color = "White";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);//calls the super class color
    }
}
public class OOPs_P15 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }    
}
