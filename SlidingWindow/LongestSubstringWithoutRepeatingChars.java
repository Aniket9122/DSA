package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static int lengthOfLongestSubstring(String s) {
        char c[] = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        int right = 0;
        while (right < c.length) {
            if (!set.contains(c[right])) {
                set.add(c[right]);
            } else {
                while (set.contains(c[right])) {
                    set.remove(c[left]);
                    left++;
                }
                set.add(c[right]);
            }
            maxLen = Math.max(maxLen, (right - left) + 1);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "bbbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
