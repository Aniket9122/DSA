package SlidingWindow;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[left] != 1) {
                left = right;
            }
            if (nums[right] == 1) {
                max = Math.max(max, right - left + 1);
            } else {
                left = right;
            }
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 0, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
