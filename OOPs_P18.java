class Member{
    String name;
    int age;
    int ph_no;
    String address;
    int salary;
    void setName(String n){
        name = n;
    }
    void setAge(int age){
        this.age = age;
    }
    void setPh(int phno){
        ph_no = phno;
    }
    void setAdd(String add){
        address = add;
    }
    void setSalary(int sal){
        salary = sal;
    }
    void getSalary(){
        System.out.println(name+"Salary = "+salary);
    }
}
class Employe extends Member{
    String specialization;
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getPhno(){
        return ph_no;
    }
    String getAddress(){
        return address;
    }
    void setSpecialization(String spec){
        specialization = spec;
    }
    String getSpecialization(){
        return specialization;
    }
}
class Manager extends Member{
    String department;
    void setDept(String dpt){
        department = dpt;
    }
}
public class OOPs_P18 {
    public static void main(String[] args) {
    Member a = new Member();
    Employe e = new Employe();
    Manager m = new Manager();
    a.setAdd("Gadag");//as same as eeee
    }
}
