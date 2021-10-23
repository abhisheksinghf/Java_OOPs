class Student{
    String name;
    int roll_no;
    void getName(String n){
        name = n;
    }
    void getRoll(int r){
        roll_no = r;
    }
    void display(){
        System.out.println("Name = "+name);
        System.out.println("Roll_No = "+roll_no);
    }
}
public class OOPs_P2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.getName("Abhi");
        s.getRoll(5);
        s.display();
    }
}
