class Rectangle{
    int length;
    int breadth;
    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    int getArea(){
        return length*breadth;
    }

}
public class OOPs_P5 {
    public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(4,5);        
    Rectangle rect2 = new Rectangle(5,8);       
    System.out.println("Area of R1 : "+rect1.getArea());
    System.out.println("Area of R2 : "+rect2.getArea());
    }
}
