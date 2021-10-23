class Triangle{
    double length,height,area;
    void setDim(double l,double h){
        length = l;
        height = h;
    }
    void getArea(){
        area = (double)1/2*length*height;
        System.out.println("Area of Triangle is "+area);
    }
}
public class OOPs_P4 {
    public static void main(String[] args) {
    Triangle t = new Triangle();
    t.setDim(5.3,9.7);
    t.getArea();        
    }
}
