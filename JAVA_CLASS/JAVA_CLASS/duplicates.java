import java.util.*;
import java.util.stream.*;

public class duplicates {
    public static void main(String[] args) {
        // Create a list with duplicates
        List<Integer> nums = Arrays.asList(10, 20, 20, 30, 40, 40);

        List<Integer> unique = nums.stream()
                                   .distinct()
                                   .collect(Collectors.toList());

        System.out.println("Unique numbers: " + unique);
    }
}
