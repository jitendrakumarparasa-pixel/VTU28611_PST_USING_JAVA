import java.util.*;

public class average {
    public static void main(String[] args) {
        
        List<Integer> nums=Arrays.asList(15,80,65,90,85);
        int total = nums.stream()
                        .mapToInt(x -> x)
                        .sum();

        int max = nums.stream()
                      .mapToInt(x -> x)
                      .max()
                      .getAsInt();

        int min = nums.stream()
                      .mapToInt(x -> x)
                      .min()
                      .getAsInt();

        double average = nums.stream()
                             .mapToInt(x -> x)
                             .average()
                             .getAsDouble();

        System.out.println("Total: " + total);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
