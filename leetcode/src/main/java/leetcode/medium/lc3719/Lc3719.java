package leetcode.medium.lc3719;

import java.util.HashSet;
import java.util.Set;

public class Lc3719 {
    public int longestBalanced(int[] nums) {
        Set<Integer> evenNumbers = new HashSet<>();
        Set<Integer> oddNumbers = new HashSet<>();
        int longest = 0, even = 0, odd = 0, length = 0;

        if (nums.length == 1) {
            return longest;
        }
        // x % 2 = 0 -> even

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0 && !evenNumbers.contains(nums[j])) {
                    even++;
                    evenNumbers.add(nums[j]);
                } else if (nums[j] % 2 == 1 && !oddNumbers.contains(nums[j])) {
                    odd++;
                    oddNumbers.add(nums[j]);
                }
                length++;

                if (even == odd) {
                    longest = Math.max(longest, length);
                }
            }

            length = 0;
            even = 0;
            odd = 0;
            evenNumbers.clear();
            oddNumbers.clear();
        }
        return longest;
    }
}

// 1 2 3 2