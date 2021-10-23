import java.lang.invoke.StringConcatFactory;

import jdk.jfr.Unsigned;

class Vidhyarthi{
    String name;
    int ph_no;
    String Address;
    void getName(String n){
        name = n;
    }
    void getPh(int ph){
        ph_no = ph;
    }
    void getAddress(String add){
        Address = add;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Phone Number : "+ph_no);
        System.out.println("Roll Number : "+Address);
        
    }

}
public class OOPs_P3 {
    public static void main(String[] args) {
        Vidhyarthi stud1 = new Vidhyarthi();
        Vidhyarthi stud2 = new Vidhyarthi();
        System.out.println("----------Student-1------------");
        stud1.getName("Abhi");
        stud1.getPh(997500000);
        stud1.getAddress("Mumbai");
        stud1.display();
        System.out.println("----------Student-2-------------");
        stud2.getName("Khush");
        stud2.getPh(750004300);
        stud2.getAddress("Bangalore");
        stud2.display();
        
    }
}
