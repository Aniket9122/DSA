package Hashing;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = i;
        while (i < nums.length) {
            if (set.contains(nums[i])) {
                nums[i] = -1;
                if (j == 0) {
                    j = i;
                }
            } else {
                set.add(nums[i]);
                if (j > 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
                }
            }
            i++;
        }
        if (set.size() == nums.length) {
            return nums.length;
        }
        set.forEach(v -> {
            System.out.println(v);
        });
        return j;
    }

    public static int removeDuplicatesWithoutSet(int[] nums) {
        int i = 1;
        int j = 1;
        while (i < nums.length) {
            if (nums[i] != nums[j - 1]) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 5, 6, 5, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int[] nums = { 0, 1, 2, 3, 4, 5, 6 };
        int k = removeDuplicates(nums);
        System.out.println("k:" + k);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}
