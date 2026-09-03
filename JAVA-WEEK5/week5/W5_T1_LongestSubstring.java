import java.util.*;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int i = 0;
        int max = 0;

        for (int j = 0; j < s.length(); j++) {

            // If duplicate is found
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }

            // Add current character
            set.add(s.charAt(j));

            // Calculate current window length
            int length = j - i + 1;

            // Update maximum
            max = Math.max(max, length);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int result = lengthOfLongestSubstring(s);

        System.out.println(result);

        sc.close();
    }
}
