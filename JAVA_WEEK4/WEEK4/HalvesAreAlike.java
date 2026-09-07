import java.util.Scanner;

public class HalvesAreAlike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        String vowels = "aeiouAEIOU";
        int mid = s.length() / 2;
        int count1 = 0, count2 = 0;

        // First half
        for (int i = 0; i < mid; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count1++;
            }
        }

        // Second half
        for (int i = mid; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count2++;
            }
        }

        if (count1 == count2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
