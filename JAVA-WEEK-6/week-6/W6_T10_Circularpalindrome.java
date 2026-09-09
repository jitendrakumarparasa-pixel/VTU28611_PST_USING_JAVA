import java.util.*;
public class W6_T10_Circularpalindrome {

    // Expand around center to find longest palindrome length
    private static int longestPalindromeLength(String s) {
        int maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            maxLen = Math.max(maxLen, expandAroundCenter(s, i, i));
            // Even length palindrome
            maxLen = Math.max(maxLen, expandAroundCenter(s, i, i + 1));
        }
        return maxLen;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome
    }

    // Function to generate rotations and compute palindrome length
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // length of string
        sc.nextLine();          // consume newline
        String s = sc.nextLine();

        // Generate rotations
        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            System.out.println(longestPalindromeLength(rotated));
        }

        sc.close();
    }
}

