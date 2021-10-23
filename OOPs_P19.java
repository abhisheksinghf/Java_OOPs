abstract interface Parent1{
    public abstract void message();
}
class Chilld implements Parent1{
    public void message(){
        System.out.println("This is a message ! ");
    }
}
public class OOPs_P19 {
    public static void main(String[] args) {
        Chilld c = new Chilld();
        c.message();
    }
}
