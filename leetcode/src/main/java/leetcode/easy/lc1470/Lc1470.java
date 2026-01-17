package leetcode.easy.lc1470;

public class Lc1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] outputArray = new int[nums.length];
        int counter = 0;

        for (int i = 0; i < nums.length; i += 2) {
            outputArray[i] = nums[counter];
            outputArray[i + 1] = nums[n];
            counter++;
            n++;
        }
        return outputArray;
    }
}
