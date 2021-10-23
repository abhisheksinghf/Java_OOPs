//Method Overriding 
class Super{
    int x;
    Super(int x){
        this.x = x;
    }
     void show(){
        System.out.println("Super x = "+x);
    }
}
class Sub extends Super{
    int y;
    Sub(int x,int y){
        super(x);
        this.y = y;
    }
    @Override
    void show(){ //this method is overridden super class show method
        System.out.println("Super x = "+x);
        System.out.println("Sub y = "+y);
    }
}
public class Methods06 {
    public static void main(String[] args) {
    Sub s = new Sub(10,20);
    s.show();
    }
}
