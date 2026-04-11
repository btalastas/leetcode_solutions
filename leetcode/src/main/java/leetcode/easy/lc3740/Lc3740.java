package leetcode.easy.lc3740;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lc3740 {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> positions = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = positions.get(nums[i]);
            if (list == null) {
                list = new ArrayList<>();
                positions.put(nums[i], list);
            }
            list.add(i);
        }

        int ans = Integer.MAX_VALUE;

        for (List<Integer> list : positions.values()) {
            for (int i = 0; i + 2 < list.size(); i++) {
                int left = list.get(i);
                int right = list.get(i + 2);
                ans = Math.min(ans, 2 * (right - left));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
