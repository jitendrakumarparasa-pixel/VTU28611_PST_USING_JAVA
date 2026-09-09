
public class W6_T4_RotateString {
    public boolean rotateString(String s, String goal) {
        // Lengths must match
        if (s.length() != goal.length()) return false;

        // Trick: If goal is a rotation of s, it must appear in s+s
        String doubled = s + s;
        return doubled.contains(goal);
    }

    // Quick test
    public static void main(String[] args) {
        W6_T4_RotateString obj = new W6_T4_RotateString();

        System.out.println(obj.rotateString("abcde", "cdeab")); // true
        System.out.println(obj.rotateString("abcde", "abced")); // false
        System.out.println(obj.rotateString("aa", "aa"));       // true
    }
}
