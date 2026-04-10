package leetcode.medium.lc3653;

public class Lc3653 {
    private static final int MOD = 1_000_000_007;

    public int xorAfterQueries(int[] nums, int[][] queries) {
        int xorAnswer = 0;

        // queries[i] = [l_i, r_i, k_i, v_i]
        // set index to l_i
        // while index is >= r_i
        // update nums[index] = (nums[index] * v_i) % (10^9 + 7)
        // increment index by k_i
        // return bitwise XOR of all elements in nums after queries

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];

            while (index <= queries[i][1]) {
                nums[index] = (int) ((long) nums[index] * queries[i][3] % MOD);
                index += queries[i][2];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            xorAnswer ^= nums[i];
        }
        return xorAnswer;
    }
}
