package leetcode.easy.lc0217;

import java.util.HashMap;

public class Lc0217 {
    public boolean containsDuplicate(int[] nums) {
        boolean containsDuplicate = false;
        HashMap<Integer, Integer> duplicateMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (duplicateMap.get(nums[i]) == null) {
                duplicateMap.put(nums[i], 1);
            } else {
                containsDuplicate = true;
            }
        }

        return containsDuplicate;
    }
}
