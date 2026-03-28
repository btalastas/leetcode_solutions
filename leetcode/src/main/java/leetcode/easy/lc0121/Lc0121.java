package leetcode.easy.lc0121;

public class Lc0121 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - minPrice;
            profit = Math.max(profit, currentProfit);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return (profit > 0) ? profit : 0;
    }
}
