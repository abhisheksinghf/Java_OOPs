public class VarArgs{
    VarArgs(String...person){
        for (String name : person) {
            System.out.println("Hello "+name);
        }

    }
    public static void main(String args[]) {
        // VarArgs("Abhi"."Jhon"."Nave")  //refer google and correct it date: 22/6/21
    }
}