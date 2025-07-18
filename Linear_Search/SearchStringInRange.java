

public class SearchStringInRange {
    public static void main(String[] args) {
        String name = "divyanshSingh";
        char target = 'y';
        System.out.println(search(name, target, 2, 6));
    }
    static int search(String name, char target, int start, int end) {
        if (name.length() == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == name.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
