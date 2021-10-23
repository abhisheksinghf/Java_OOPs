import java.util.Scanner;

class Average{
    // int a,b,c;
    Average(int a,int b,int c){
        System.out.println("Average  = "+(a+b+c)/3);
    }
}
public class OOPs_P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Average avg = new Average(a,b,c);
        // System.out.println("Average = "+avg.Avg());
    }
}
