import java.util.*;

public class W6_T3_Twostrings {

    // Function to check if two strings share a common substring
    static String twoStrings(String s1, String s2) {
        // Use a HashSet to store characters of s1
        Set<Character> set = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        // Check if any character of s2 exists in s1
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // number of test cases
        sc.nextLine();          // consume newline

        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(twoStrings(s1, s2));
        }

        sc.close();
    }
}
