package sample;
//Single Inheritance
class Area01{
    int length ;
    int breadth ;
    Area01(int a,int b){
        length  = a;
        breadth = b;
    }
    int area(){
        return (length*breadth);
    }
}
class Area02 extends Area01{
    int height;
    Area02(int a, int b, int h) {
        super(a, b);
        height = h;
    }
    
    int volume(){
        return length*breadth*height;
    }
}
public class Inheritance01 {
    public static void main(String[] args) {
    
    Area02 a = new Area02(3,4,7);    
    int x = a.area();
    int y = a.volume();
    System.out.println(x);
    System.out.println(y);

    }
}
