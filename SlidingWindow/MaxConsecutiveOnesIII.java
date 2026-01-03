package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        int left = 0;
        int right = 0;

        if (k == 0) {
            while (right < nums.length) {
                if (nums[left] == 0) {
                    left = right;
                }
                if (nums[right] == 1) {
                    max = Math.max(max, right - left + 1);
                } else {
                    left = right;
                }
                right++;
            }
        } else {
            while (right < nums.length) {
                if (nums[right] == 0) {
                    if (queue.size() < k) {
                        queue.add(right);
                    } else {
                        left = queue.poll() + 1;
                        queue.add(right);
                    }
                }
                max = Math.max(max, right - left + 1);
                right++;
            }
        }
        return max;
    }

    public static int longestOnesWithoutQueue(int[] nums, int k) {
        int max = 0;
        int left = 0;
        int right = 0;
        int kCount = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                kCount++;
            }
            if (kCount > k) {
                if (nums[left] == 0) {
                    kCount--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0 };
        System.out.println(longestOnesWithoutQueue(nums, 2));
    }
}
