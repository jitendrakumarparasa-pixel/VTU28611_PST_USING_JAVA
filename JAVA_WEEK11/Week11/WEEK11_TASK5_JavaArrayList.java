import java.util.ArrayList;

public class WEEK11_TASK5_JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Initial list: " + names);
        names.add(1, "David");
        System.out.println("After insert: " + names);

        names.set(2, "Eve");
        System.out.println("After update: " + names);

        names.remove("Alice");
        System.out.println("After remove: " + names);

        System.out.println("Element at index 1: " + names.get(1));
        System.out.println("List size: " + names.size());
    }
}
