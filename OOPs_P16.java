//2) super can be used to invoke parent class method
class Prani{
    void eat(){
        System.out.println("Eating....");
    }
}
class Sher extends Prani{
    void eat(){
        System.out.println("Eating Flesh....");
    }
    void roar(){
        System.out.println("Khraw..Khraw....");
    }
    void work(){
        super.eat();//calls super class eat
        eat();
        roar();
    }
}
public class OOPs_P16 {
    public static void main(String[] args) {
        Sher s = new Sher();
        s.eat();
        s.work();

    }
}
