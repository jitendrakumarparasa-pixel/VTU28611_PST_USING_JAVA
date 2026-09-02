import java.util.Scanner;

public class STASK4 {

    static void computeLPS(String pattern, int[] lps) {
        int length = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    static void kmpSearch(String text, String pattern) {
        int[] lps = new int[pattern.length()];
        computeLPS(pattern, lps);

        int i = 0;
        int j = 0;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                System.out.print((i - j) + " ");
                j = lps[j - 1];
            } else if (i < text.length()
                    && text.charAt(i) != pattern.charAt(j)) {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine().trim();
        String pattern = sc.nextLine().trim();

        kmpSearch(text, pattern);

        sc.close();
    }
}
