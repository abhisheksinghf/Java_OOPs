class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating..");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
     void speak(){
        System.out.println("Hello Sir");
    }

}
public class MultipleInheritance{
    public static void main(String[] args) {
        Human h = new Human();
        h.bite();
        h.eat();
        h.sleep();
        h.speak();        
        System.out.println();//just for space
        Monkey m = new Human();
        m.bite();
        m.jump();
        // m.eat();//not allowed
        // m.speak();//not allowed
        BasicAnimal ba = new Human();
        ba.sleep();
        ba.eat();        
    }    
}
