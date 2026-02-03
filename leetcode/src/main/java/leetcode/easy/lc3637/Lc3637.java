package leetcode.easy.lc3637;

public class Lc3637 {

    private boolean leftAscending(int[] nums, int p) {

        for (int i = 0; i < p; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private boolean descending(int[] nums, int p, int q) {

        for (int i = p; i < q; i++) {
            if (nums[i] <= nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private boolean rightAscending(int[] nums, int q) {

        for (int i = q; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public boolean isTrionic(int[] nums) {
        int p = 1;
        int q = p + 1;
        boolean satifies = false;
        // 0 < p < q < n-1

        while (p < q && q < nums.length - 1) {

            // check first
            if (!leftAscending(nums, p)) {
                // move p pointer
                p++;
                continue;
            }

            // check middle
            if (!descending(nums, p, q)) {
                // move p and q pointer
                p++;
                q++;
                continue;
            }

            // check last

            if (!rightAscending(nums, q)) {
                // move q pointer
                q++;
                continue;
            }
            satifies = true;
            break;
        }

        return satifies;
    }
}
