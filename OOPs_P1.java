import java.util.Scanner;

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
    public class OOPs_P1{
        public static void main(String[] args) {
            int a,b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Length : ");
            a = sc.nextInt();
            System.out.println("Enter the Breadth : ");
            b = sc.nextInt();
    
            Arrea aa = new Arrea();
            aa.setDim(a,b);
            System.out.println("Area of Rectangle is "+aa.getArea());
        }    
    }
    