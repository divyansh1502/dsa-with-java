import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String name = "Divyansh Singh Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('i'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
