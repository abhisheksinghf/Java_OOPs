//Nesting of methods
class NestingMethods{
    int x;
    int y;
    NestingMethods(int a,int b){
        x = a;
        y = b;
    }
    public int largest(){
        if(x>y)
            return x;
        else
            return y;    
    }
    public void biggest(){
        int large = largest();//this is nesting of methods
        System.out.println("Largest = "+large);
    }
}
public class Methods05 {
    public static void main(String[] args) {
        NestingMethods meth = new NestingMethods(100,60);
        meth.biggest();
    }
}
