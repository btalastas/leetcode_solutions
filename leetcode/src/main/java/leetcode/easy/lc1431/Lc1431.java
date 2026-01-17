package leetcode.easy.lc1431;

import java.util.ArrayList;
import java.util.List;

public class Lc1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestCandylBooleans = new ArrayList<>();
        int maxAmount = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= maxAmount) {
                maxAmount = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= maxAmount) {
                greatestCandylBooleans.add(true);
            } else {
                greatestCandylBooleans.add(false);
            }
        }

        return greatestCandylBooleans;
    }
}
