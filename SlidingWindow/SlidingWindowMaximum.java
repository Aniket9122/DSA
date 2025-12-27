package SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static int max(int[] nums, int l, int r) {
        int max = nums[l];
        for (int i = l; i < r; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    // public static int[] maxSlidingWindow(int[] nums, int k) {
    // int result[] = new int[nums.length - k + 1];
    // for (int i = 0; i < nums.length - k + 1; i++) {
    // result[i] = max(nums, i, i + k);
    // }
    // return result;
    // }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int result[] = new int[nums.length - k + 1];
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            if (!queue.isEmpty() && nums[queue.peek()] <= nums[i]) {
                while (!queue.isEmpty()) {
                    queue.pop();
                }
            }
            queue.add(i);
        }
        result[0] = nums[queue.peek()];
        for (int i = k; i < nums.length; i++) {
            if (queue.peek() < i - k + 1) {
                queue.pop();
            }
            if (!queue.isEmpty() && nums[queue.peek()] <= nums[i]) {
                while (!queue.isEmpty()) {
                    queue.pop();
                }
            } else if (!queue.isEmpty() && nums[queue.getLast()] <= nums[i]) {
                while (nums[queue.getLast()] <= nums[i] || queue.isEmpty()) {
                    queue.removeLast();
                }
            }
            queue.add(i);
            result[i - k + 1] = nums[queue.peek()];
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 1, 2, 0, 5 };
        int result[] = maxSlidingWindow(nums, 3);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
