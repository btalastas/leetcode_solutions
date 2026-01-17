package leetcode.easy.lc1295;

public class Lc1295 {
    public int findNumbers(int[] nums) {

        int counter = 0;

        int total = 0;

        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != 0) {

                nums[i] /= 10;

                ++counter;

            }

            if (counter % 2 == 0) {

                total++;

            }

            counter = 0;

        }

        return total;

    }
}
