
public class maximumsubarray {

    public static int maxsubarray(int[] nums) {

        int currentsum = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentsum = Math.max(nums[i], currentsum + nums[i]);

            result = Math.max(result, currentsum);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxsubarray(arr);

        System.out.println("Maximum sub array: " + result);
    }
}