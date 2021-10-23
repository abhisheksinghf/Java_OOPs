import java.util.Scanner;

class Rectanglee { // i know the spelling is wrong...just to avoid repeatence
    int length;
    int breadth;

    Rectanglee(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        return length * breadth;
    }
}

public class OOPs_P6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Length : ");
        int length = s.nextInt();
        System.out.println("Enter the Breadth : ");
        int breadth = s.nextInt();
        Rectanglee r = new Rectanglee(length,breadth);        
        System.out.println("Area of Rectangle is "+r.returnArea());
        
    }
}
