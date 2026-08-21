import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        int aliceScore = 0;
        int bobScore = 0;
        
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                System.out.println("then Alice is awarded 1 point");
                aliceScore++;
            } else if (a[i] < b[i]) {
                System.out.println("then Bob is awarded 1 point.");
                bobScore++;
            } else { 
                System.out.println("then neither person receives a point.");
            }
        }
        System.out.println(aliceScore + " " + bobScore);

        sc.close();
    }
}
