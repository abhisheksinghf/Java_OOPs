
class Arrea{
int length;
int breadth;
    public void setDim(int l,int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
}
public class Prgm01{
    public static void main(String[] args) {
        Arrea a = new Arrea();
        a.setDim(10,14);
        System.out.println("Area of Rectangle is "+a.getArea());
    }    
}
