class Employee{
    String name;
    int yearOfJoining;
    int salary;
    String address;
    Employee(String n,int yoj,int s,String add){
        name = n;
        yearOfJoining = yoj;
        salary = s;
        address = add;
    }
    void display(){
        System.out.println(name+"        "+yearOfJoining+"        "+address);
    }
}
public class OOPs_P8 {
    public static void main(String[] args) {
        System.out.println("Name        YearOfJoin        Address");
        Employee emp1 = new Employee("Jhon",2018,85000,"Washington DC");
        Employee emp2 = new Employee("Kevin",2019,90000,"New York");
        Employee emp3 = new Employee("Abhi",2016,100000,"London");
        Employee emp4 = new Employee("Rock",2020,30000,"UAE");
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
    }
}
