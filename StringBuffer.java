public class StringBuffer{
    public static void main(String args[]) {
        String str = "Object Language";
    System.out.println("Orignal String = "+str);
    //obtaining string length
    System.out.println("Length : "+str.length());
    //Accessing characters in the string 
    for(int i = 0; i < str.length(); i++){
        int p = i + 1;
        System.out.println("Character at position "+p+" is "+str.charAt(i));
    }
    new String(str.toString());
    int y = str.indexOf(" ");
    int x = str.indexOf("Oriented",y);
    System.out.println(x);
    
    }
}
