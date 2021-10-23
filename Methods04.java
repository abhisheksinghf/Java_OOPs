class MathOp{
    static int sum(int a,int b){
        return a+b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
}
public class Methods04 {
    public static void main(String[] args) {
        float x = MathOp.sum(21,19);//static variables can be accessed in a static way
        float y = MathOp.multiply(4,5); //accessing in static way
        System.out.println("Sum = "+x);
        System.out.println("Product = "+y);
    }
}
