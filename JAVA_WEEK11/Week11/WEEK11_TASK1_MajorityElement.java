public class WEEK11_TASK1_MajorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        int votes = 0;
        for (int num : nums) {
            if (num == candidate) {
                votes++;
            }
        }

        return votes > nums.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 2, 3, 2, 2};
        System.out.println("Majority element: " + majorityElement(nums));
    }
}
