import java.util.*;

public class W6_T7_PalindromeIndex {

    // Helper function to check if a substring is palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to find index of character to remove
    static int palindromeIndex(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try removing left character
                if (isPalindrome(s, left + 1, right)) {
                    return left;
                }
                // Try removing right character
                if (isPalindrome(s, left, right - 1)) {
                    return right;
                }
                // No solution
                return -1;
            }
            left++;
            right--;
        }
        // Already a palindrome
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();   // number of queries
        sc.nextLine();          // consume newline

        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println(palindromeIndex(s));
        }

        sc.close();
    }
}
