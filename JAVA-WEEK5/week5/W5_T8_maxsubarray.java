
public class maxsubarray {

    public static int[] maxSubarray(int[] arr) {

        // Maximum Subarray
        int currentSum = arr[0];
        int maxSubarray = arr[0];

        // Maximum Subsequence
        int maxSubsequence = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Kadane's Algorithm
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSubarray = Math.max(maxSubarray, currentSum);

            // For subsequence
            if (arr[i] > 0) {
                maxSubsequence += arr[i];
            } else {
                maxSubsequence = Math.max(maxSubsequence, arr[i]);
            }
        }

        return new int[]{maxSubarray, maxSubsequence};
    }

    public static void main(String[] args) {

        int[] arr = {2, -1, 2, 3, 4, -5};

        int[] result = maxSubarray(arr);

        System.out.println(result[0] + " " + result[1]);
    }
}
