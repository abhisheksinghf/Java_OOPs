class RectangleArea{
    int length;
    int breadth;
    public void setData(int l,int b) {
        length = l;
        breadth = b;
    }
    public void getData() {
        System.out.println("Area of Rectangle : "+length*breadth);
    }
}
public class Methods02 {
    public static void main(String[] args) {
    RectangleArea r;
    r = new RectangleArea(); //we can also declare like this
    // RectangleArea a = new RectangleArea();
        r.setData(4,8);
        r.getData();
    }
    
}
