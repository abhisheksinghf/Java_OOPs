//Multilevel Inheritance
class Car{
    Car(){ // constructor
        System.out.println("Class Car");
    }
    private void vehicleType(){
        System.out.println("Vehicle Type : Car");
    }
}
class Tesla extends Car{
    Tesla(){
        System.out.println("Class Tesla");
    }
    void Owner(){
        System.out.println("Elon Musk");
    }
    void maxSpeed(){
        System.out.println("Speed : 200 km/hr");
    }
}
class TeslaModelX extends Tesla{
    TeslaModelX(){
        System.out.println("class TeslaModelX ");
    }
    void color(){
        System.out.println("Color : Red");
    }
    void Engine(){
        System.out.println("Engine : Tes.X");
    }
}
public class Inheritance02 {
    public static void main(String[] args) {
    TeslaModelX c = new TeslaModelX();
    // c.vehicleType(); cozz its private
    c.Owner();
    c.maxSpeed();
    c.color();

    }
}
