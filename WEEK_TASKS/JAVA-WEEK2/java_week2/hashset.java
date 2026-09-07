import java.util.HashSet;
import java.util.Scanner;

public class hashset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter first string: ");
            String first = sc.next();

            System.out.print("Enter second string: ");
            String second = sc.next();

            String pair = first + " " + second;

            set.add(pair);

            System.out.println("Distinct Pairs = " + set.size());
        }

        sc.close();
    }
}
