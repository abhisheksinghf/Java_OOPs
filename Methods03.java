package sample.meth;
//Method Overloading
class Operatios{
    int a,b;
    public void greet(){
        System.out.println("Good Night ! ");
    }
    public void sum() {
        System.out.println("I dont take any Parameters ! ");
    }
    public int sum(int a,int b){
        return a+b;
    }
}
public class Methods03 {
    public static void main(String[] args) {
    Operatios op = new Operatios();
    op.greet();
    op.sum();
    System.out.println(op.sum(4,6));
    }
}
