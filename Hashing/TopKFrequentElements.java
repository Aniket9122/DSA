package Hashing;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int result[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            priorityQueue.add(key);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        for (int i = k - 1; i >= 0; i--) {
            result[i] = priorityQueue.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

        int res[] = topKFrequent(nums, 2);

        for (int r : res) {
            System.out.println(r);
        }
    }
}
