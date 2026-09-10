import java.util.*;
import java.util.stream.*;
 public class Square {
    public static void main(String[] args) {
        
        List<Integer> numbers=Arrays.asList(2,4,6,8,10);

        List<Integer> squares=numbers.stream()
        .map(x -> x * x)
        .collect(Collectors.toList());

        System.out.println("numbers :" + squares);
    }
 }