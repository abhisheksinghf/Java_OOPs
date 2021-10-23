class Access{
int a = 10;//friendly access(default) 
public int b = 20;//public access
private int c = 30;//private access
protected int d = 40;//protected access means cannot be accessed by oter non-subclasses
// private protected int e = 50;

}

public class VisibilityControl {
    public static void main(String[] args) {
    Access a = new Access();
    System.out.println(a.a);
    System.out.println(a.b);
    // System.out.println(a.c); //cannot access
    System.out.println(a.d);
    }
}
