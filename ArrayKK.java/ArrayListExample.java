import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList is a resizable array implementation in Java that allows us to store dynamic data.
        // Unlike regular arrays, it can grow or shrink in size automatically as elements are added or removed.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(25);
        list.add(255);
        list.add(2145);
        list.add(6947);

        System.out.println(list.contains(2145));
        System.out.println(list.set(0, 99));
        System.out.println(list.remove(2));
        System.out.println(list);
    }
}
