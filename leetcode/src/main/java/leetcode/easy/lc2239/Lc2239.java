package leetcode.easy.lc2239;

public class Lc2239 {
    public int findClosestNumber(int[] nums) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(answer) || (Math.abs(nums[i]) == Math.abs(answer) && nums[i] > answer)) {
                answer = nums[i];
            }
        }

        return answer;
    }
}
