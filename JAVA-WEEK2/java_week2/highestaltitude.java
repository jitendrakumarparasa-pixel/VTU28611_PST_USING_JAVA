import java.util.Scanner;

public class highestaltitude {

    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];

            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }
h
        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of gains: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter the gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int result = largestAltitude(gain);

        System.out.println("Highest Altitude: " + result);

        sc.close();
    }
}
