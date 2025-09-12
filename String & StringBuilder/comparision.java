
public class comparision {
    public static void main(String[] args) {
        String a = "Divyansh";
        String b = "Divyansh";

        System.out.println(a == b);
        //== checks whether reference variable is pointing to the same variable if it's not than answer will be false
        String c = new String("Divyansh");
        String d = new String("Divyansh");
        System.out.println(c == d);
        System.out.println(c.equals(d));// it is a method.It does'nt care it only sees the Divyansh if same give true otherwise false
        System.out.println(c.charAt(0)); //System.out.println(c[0]); it is not possible in case of string
        // In Java, String is an immutable object stored in the String pool; 
        // once created it cannot be changed, and new values create new objects.
    }
}
