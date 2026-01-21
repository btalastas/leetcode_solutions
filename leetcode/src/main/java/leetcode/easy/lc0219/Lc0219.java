package leetcode.easy.lc0219;

public class Lc0219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int index = k;

        if (k == 0) {
            return false;
        } else if (nums.length == 2) {
            if (nums[0] == nums[1]) {
                return true;
            }
        } else {

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                        return true;
                    } else if (Math.abs(i - j) > k) {
                        break;
                    }
                }
            }

            // if (k > nums.length) {
            // for (int i = 0; i < nums.length - 1;) {
            // for (int j = i + 1; j < nums.length; j++) {
            // if (nums[i] == nums[j]) {
            // return true;
            // }
            // }
            // }
            // } else {
            // for (int i = 0; i < nums.length - k; i++) {
            // for (int j = i + 1; j <= index; j++) {
            // if (nums[i] == nums[j]) {
            // return true;
            // }
            // }
            // index++;
            // }
            // }

        }

        return false;
    }
}