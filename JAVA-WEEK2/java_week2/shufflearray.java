import java.util.Scanner;

public class shufflearray {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        // Input array
        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call shuffle method
        int[] ans = shuffle(nums, n);

        // Print result
        System.out.print("Shuffled Array: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}