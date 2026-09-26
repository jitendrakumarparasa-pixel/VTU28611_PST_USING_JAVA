import java.util.*;

public class SYLLABUS_TASK7_HashtagFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String hashtag = sc.next();

            map.put(hashtag, map.getOrDefault(hashtag, 0) + 1);
        }

        for (String hashtag : map.keySet()) {
            System.out.println(hashtag + " " + map.get(hashtag));
        }
    }
}