class Rectangle{
    // int length;
    // int breadth;
    public void area(int l,int b) {
        float area;
        area = (float)l*b; 
        System.out.println("Area of Rectangle is "+area);
    }
}
public class Area{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area(4, 6);
    }
}