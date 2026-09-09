public class W6_T9_LongestSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            int len1 = expandAroundCenter(s, i, i);
            // Even length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome
    }

    // Quick test
    public static void main(String[] args) {
        W6_T9_LongestSubstring obj = new W6_T9_LongestSubstring();

        System.out.println(obj.longestPalindrome("babad")); // "bab" or "aba"
        System.out.println(obj.longestPalindrome("cbbd"));  // "bb"
        System.out.println(obj.longestPalindrome("a"));     // "a"
        System.out.println(obj.longestPalindrome("ac"));    // "a" or "c"
    }
}
