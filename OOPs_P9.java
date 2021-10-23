class EmployeeInfo{
    int salary;
    int hours;
    void getInfo(int sal,int hrs){
        salary = sal;
        hours = hrs;
        addSal();
        addWork();
    }
    void addSal(){
        if (salary<20000) {
            salary = salary+2000;
        }
    }
    void addWork(){
        if(hours>6){
            salary = salary+10000;
        }
    }
    void display(){
        System.out.println("Salary = "+salary);
        System.out.println("Hours = "+hours);
    }
}
public class OOPs_P9 {
    public static void main(String[] args) {
        EmployeeInfo e1 = new EmployeeInfo();
        EmployeeInfo e2 = new EmployeeInfo();
        EmployeeInfo e3 = new EmployeeInfo();
        EmployeeInfo e4 = new EmployeeInfo();
        e1.getInfo(50000,8);        
        e1.display();
        e2.getInfo(10000,3);
        e2.display();
        e3.getInfo(60000,4);
        e3.display();
        e4.getInfo(80000,10);
        e4.display();

    }
}
