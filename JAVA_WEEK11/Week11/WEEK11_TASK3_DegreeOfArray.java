import java.util.HashMap;
import java.util.Map;

public class WEEK11_TASK3_DegreeOfArray {
    public static int degreeOfArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int degree = 0;
        for (int value : freq.values()) {
            degree = Math.max(degree, value);
        }

        int minLength = nums.length;
        for (int start = 0; start < nums.length; start++) {
            Map<Integer, Integer> windowFreq = new HashMap<>();
            for (int end = start; end < nums.length; end++) {
                int current = nums[end];
                windowFreq.put(current, windowFreq.getOrDefault(current, 0) + 1);

                int maxInWindow = 0;
                for (int count : windowFreq.values()) {
                    maxInWindow = Math.max(maxInWindow, count);
                }

                if (maxInWindow == degree) {
                    minLength = Math.min(minLength, end - start + 1);
                }
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println("Shortest subarray length: " + degreeOfArray(nums));
    }
}
