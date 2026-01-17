package leetcode.easy.lc3074;

import java.util.Arrays;

public class Lc3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int totalApples = Arrays.stream(apple).sum();
        int totalBoxes = 0;

        Arrays.sort(capacity);

        for (int i = capacity.length - 1; i >= 0; i--) {
            totalApples -= capacity[i];
            totalBoxes++;

            if (totalApples <= 0) {
                break;
            }
        }

        return totalBoxes;
    }
}
