class Animal{
    void food(){
        System.out.println("What kind of food do animals eat ? ");
    }
}
class Lion extends Animal{
    void food(int x){
        System.out.println("Lion Eats Flesh");
    }
}
public class OOPs_P13 extends Lion {
    public static void main(String[] args) {
        Animal a = new Lion();
        a.food();//food method of class animal is called
        Lion l = new Lion();
        l.food();
        l.food(20);
    }
}
