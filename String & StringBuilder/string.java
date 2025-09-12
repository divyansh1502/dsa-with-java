
public class string {
    public static void main(String[] args) {
        String name = "Divyansh Singh";
        System.out.println(name);
        String a = "Divyansh";
        System.out.println(a);
        a = "Singh"; // String are immutable here we are not changing the string here we are creating another object to store Sing
        System.out.println(a);
        // why we cannot modify string objects ?
        //suppose there are four person of same name and one person want to change their name than all the other three person name will also be changed that's why its immutable
    }
}
