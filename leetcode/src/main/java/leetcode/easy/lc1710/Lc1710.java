package leetcode.easy.lc1710;

import java.util.Arrays;

public class Lc1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int units = 0;

        if (truckSize == 0) {
            return units;
        }
        Arrays.sort(boxTypes, (row1, row2) -> Integer.compare(row2[1], row1[1]));

        for (int i = 0; i < boxTypes.length; i++) {

            if (truckSize - boxTypes[i][0] > 0) {
                units += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }

            else {
                while (truckSize != 0 && boxTypes[i][0] != 0) {
                    truckSize--;
                    boxTypes[i][0]--;
                    units += boxTypes[i][1];
                }

            }

            if (truckSize == 0) {
                break;
            }
        }

        return units;
    }
}
