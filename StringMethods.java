public class StringMethods{
    public static void main(String[] args) {
        String name = "  Abhisheksingh";//declation
        String greet = new String("Hello");//declaration
        System.out.println(name);
        System.out.println(greet);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace('i','a'));//replaces i by a
        System.out.println(name.trim());//remove white spaces
        System.out.println(name.equals(greet));//returns true if equal to greet
        System.out.println(name.equalsIgnoreCase(greet));//returns true if equal to greet ignores case
        System.out.println(name.length());
        System.out.println(name.charAt(3));//returns the char at index 3
        System.out.println(name.compareTo(greet));//returns -ve if less and returns +ve if greater and 0 if equal
        System.out.println(name.concat(greet));//joins greet and name
        System.out.println(name.substring(3));//starts from index 3
        System.out.println(name.substring(0,9));
        System.out.println(String.valueOf(5));//converts any data type to string now 5 is a string here
        System.out.println(name.indexOf('h'));//index of h in name
        System.out.println(name.indexOf('h',3));//index of h that come after 3rd position
        System.out.println(String.valueOf(name));//prints the string value
    }
}