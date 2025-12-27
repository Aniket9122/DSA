package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.keySet().contains(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int[] result = twoSum(nums, 6);
    }
}
