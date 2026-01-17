package leetcode.easy.lc1672;

public class Lc1672 {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int counter = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                counter += accounts[i][j];
            }
            if (counter >= wealth) {
                wealth = counter;
            }
            counter = 0;
        }

        return wealth;
    }
}
