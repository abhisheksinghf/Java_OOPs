//interfaces cleared
class AA {
    int x = 20;
    int y = 30;

    void msg1() {
        System.out.println("I Am Msg1 of class AA");
    }

    void msg2() {
        System.out.println("I Am Msg2 of class AA");
    }
}

class BB extends AA {
    int x = 60;
    int z = 40;

    @Override
    void msg2() {
        System.out.println("I Am Msg2 of class BB");
    }

    void msg3() {
        System.out.println("I am Msg3 of class BB");
    }
}

public class OOPs_P14 {
    public static void main(String[] args) throws InterruptedException {
        AA a = new AA();
        System.out.println("----------Senario-1---------");
        a.msg1();
        a.msg2();
        // a.msg3()//error coz the class does not exist in class AA
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println("----------Senario-2---------");
        BB b = new BB();
        System.out.println(b.x);// by default BB class b is called
        System.out.println(b.y);// y of class BB is called because by default, y of class AA is available in
                                // class BB through inheritance.
        b.msg1();
        b.msg2();// Overriddin by class BB
        b.msg3();
        System.out.println("----------Senario-3---------");
        AA a1 = new BB();// 'a' is reference variable of class AA but pointing to the object of class BB.
        System.out.println(a1.x);
        System.out.println(a1.y);
        // System.out.println(a1.z);//error coz z does not exist in AA class
        a1.msg1();
        a1.msg2();// Overridden class
        // a1.msg3();
        System.out.println("----------Senario-4---------");
        AA x = new AA();
        BB y = new BB();
        x = y;
        System.out.println(x.x);
        System.out.println(x.y);
        // System.out.println(x.z);//error
        x.msg1();
        x.msg2();
        // x.msg3();//error
        System.out.println("----------Senario-5---------");
        // AA aa = new BB();
        // BB bb = new BB();
        // b = (BB) a; // It looks like superclass assigned to subclass but it translates internally to
        //             // // BB b=new BB(); // It is equivalent to 2nd scenario.

        // System.out.println("Value of x: " + aa.x);
        // System.out.println("Value of y: " + aa.y);
        // System.out.println("Value of z: " +a.z); // Error because z does not exist in
        // class AA.
    }
}
