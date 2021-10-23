class Student{
    String name;
    /*final*/ int number = 10;//we cannot access variable if we use static keyword
    public void sayHii() {
        System.out.println("Hii !");
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        System.out.println("My name is "+name);
        return name;
    }
}
public class Methods{
    public static void main(String[] args) {
        Student s = new Student();
        s.sayHii();
        s.setName("Abhisheksingh");
        // System.out.println(s.getName());
        s.getName();
        s.number = 12; // accessing class variables
        System.out.println(s.number);
    }
}