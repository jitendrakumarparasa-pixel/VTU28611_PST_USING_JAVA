import java.util.Scanner;

public class W6_T5_MarsExploration {

    // Function to count altered letters
    static int marsExploration(String s) {   // lowercase 'm'
        int changes = 0;
        String expected = "SOS";

        for (int i = 0; i < s.length(); i++) {
            // Compare each character with the repeating "SOS" pattern
            if (s.charAt(i) != expected.charAt(i % 3)) {
                changes++;
            }
        }
        return changes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   // received signal
        System.out.println(marsExploration(s));
        sc.close();
    }
}
