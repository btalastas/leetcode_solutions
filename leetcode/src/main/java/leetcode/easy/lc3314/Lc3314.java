package leetcode.easy.lc3314;

import java.util.List;

public class Lc3314 {

    public int[] minBitwiseArray(List<Integer> nums) {

        int[] ans = new int[nums.size()];

        for (int i = 0; i < ans.length; i++) {
            // ans[i] | (ans[i] + 1) == nums[i]
            ans[i] = -1;
            int value = nums.get(i);
            for (int j = 0; j < value; j++) {
                if ((j | (j + 1)) == value) {
                    ans[i] = j;
                    break;
                }

            }

        }

        return ans;
    }
}
