public class W6_T2_Repeatingsubstring {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        // Trick: If s is a repeated substring, then s must appear in (s+s)[1..2n-1]
        String doubled = s + s;
        
        // Remove first and last character to avoid trivial match
        String trimmed = doubled.substring(1, doubled.length() - 1);
        
        return trimmed.contains(s);
    }

    // Quick test
    public static void main(String[] args) {
        W6_T2_Repeatingsubstring obj = new W6_T2_Repeatingsubstring();
        
        System.out.println(obj.repeatedSubstringPattern("abab")); // true
        System.out.println(obj.repeatedSubstringPattern("aba"));  // false
        System.out.println(obj.repeatedSubstringPattern("abcabcabc")); // true
        System.out.println(obj.repeatedSubstringPattern("a"));    // false
    }
}
