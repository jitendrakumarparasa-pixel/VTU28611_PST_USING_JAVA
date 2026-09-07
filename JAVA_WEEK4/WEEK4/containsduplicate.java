import java.util.Arrays;
import java.util.Scanner;

public class containsduplicate {
    public boolean containsduplicate(int[] nums) {
        long distinctcount = Arrays.stream(nums).distinct().count();
        return distinctcount != nums.length;
    }

    public static void main(String[] args) {
        containsduplicate c = new containsduplicate();
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number :");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(c.containsduplicate(nums));
        sc.close();
    }
}
