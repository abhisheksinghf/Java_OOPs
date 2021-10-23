interface Areaa{
    static final double PI = Math.PI;
    double compute(int x,int y);
}
class Rectangle1 implements Areaa{
    public double compute(int x,int y){
        return x*y;
    }
}
class Circle1 implements Areaa{
    public double compute(int x,int y){
        return PI*x*x;
    }
}
public class Interfaces{
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        Circle1 c = new Circle1();
        Areaa area;
        area = r;
        System.out.println("Rectangle : "+area.compute(10, 2));
        area = c;
        System.out.println("Circlr : "+c.compute(4, 5));

    }
}