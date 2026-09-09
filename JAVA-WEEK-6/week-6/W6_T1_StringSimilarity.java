import java.util.Scanner;

public class W6_T1_StringSimilarity {

    // Function to calculate sum of similarities using Z-algorithm
    static long stringSimilarity(String s) {
        int n = s.length();
        int[] Z = new int[n];
        long result = n; // similarity with itself is always full length

        int left = 0, right = 0;
        for (int i = 1; i < n; i++) {
            if (i <= right) {
                Z[i] = Math.min(right - i + 1, Z[i - left]);
            }
            while (i + Z[i] < n && s.charAt(Z[i]) == s.charAt(i + Z[i])) {
                Z[i]++;
            }
            if (i + Z[i] - 1 > right) {
                left = i;
                right = i + Z[i] - 1;
            }
            result += Z[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // number of test cases
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(stringSimilarity(s));
        }
        sc.close();
    }
}
