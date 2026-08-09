
import java.util.*;
import java.util.stream.Collectors;
public class count {
    public static void main(String[] args) {
        
        List<Integer> nums=Arrays.asList(20,40,78,98,9,100);

     List<Integer> above75 = nums.stream()
                            .filter(n -> n > 75)
                            .collect(Collectors.toList());

System.out.println("Numbers above 75: " + above75);
System.out.println("Count: " + above75.size());

    }
}
