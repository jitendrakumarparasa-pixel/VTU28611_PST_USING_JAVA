public class circularsubarray {

    public static int maxSubarraySumCircular(int[] nums) {

        // Normal maximum subarray
        int currentMax = nums[0];
        int maxSum = nums[0];

        // Minimum subarray
        int currentMin = nums[0];
        int minSum = nums[0];

        // Total sum of the array
        int totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Kadane's algorithm for maximum subarray
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);

            // Kadane's algorithm for minimum subarray
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);

            // Add current element to total
            totalSum += nums[i];
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum circular sum
        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);
    }

    public static void main(String[] args) {

        int[] nums = {5, -3, 5};

        int result = maxSubarraySumCircular(nums);

        System.out.println("Maximum Circular Subarray Sum = " + result);
    }
}
