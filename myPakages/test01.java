package myPakages;
class Rectangle021{
    // int length;
    // int breadth;
    public void area(int l,int b) {
        float area;
        area = (float)l*b; 
        System.out.println("Area of Rectangle is "+area);
    }
}
public class test01{
    public static void main(String[] args) {
        Rectangle021 r = new Rectangle021();
        r.area(4, 6);
    }
}