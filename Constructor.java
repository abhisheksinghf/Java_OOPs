package constructor0;
class iAmConstructor{
    int length;
    int breadth;
    iAmConstructor(int l,int b) //this is a constructor
    {
        length = l;
        breadth = b;
    }
    public void Area(){
        System.out.println("Area = "+length*breadth);
        // return length*breadth;
    }
}
public class Constructor {
    public static void main(String[] args) {
        iAmConstructor cons = new iAmConstructor(10,20);
        cons.Area();
    }
}