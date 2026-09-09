public class W6_T8_OccurenceString{
    public int strStr(String haystack, String needle) {
        // Edge case: empty needle
        if (needle.isEmpty()) return 0;

        int n = haystack.length();
        int m = needle.length();

        // Slide window of size m across haystack
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    // Quick test
    public static void main(String[] args) {
        W6_T8_OccurenceString obj = new W6_T8_OccurenceString();

        System.out.println(obj.strStr("sadbutsad", "sad")); // 0
        System.out.println(obj.strStr("sadbutsad", "but")); // 3
        System.out.println(obj.strStr("leetcode", "leeto")); // -1
    }
}
