
public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.println(ch);
            series = series + ch; // series += ch
        }
        System.out.println(series); // Time complexity is O(n2) bcz every time new object is form and we add another alphabet on it wastage of memory
                                    //that's why we use string builder in which we can modify the original string String builder is mutable
        System.out.println("a" + 'b');
    }
}
