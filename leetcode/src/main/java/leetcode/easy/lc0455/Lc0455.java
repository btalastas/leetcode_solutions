package leetcode.easy.lc0455;

import java.util.Arrays;

public class Lc0455 {
    public int findContentChildren(int[] g, int[] s) {

        if (s.length == 0) {
            return 0;
        }
        int counter = 0;
        int[] childrenSorted = g;
        int[] cookiesSorted = s;
        Arrays.sort(childrenSorted);
        Arrays.sort(cookiesSorted);
        int childrenPointer = 0;
        int cookiesPointer = 0;

        while (cookiesPointer < cookiesSorted.length && childrenPointer < childrenSorted.length) {
            System.out.println("children: " + childrenSorted[childrenPointer]);
            System.out.println("cookoes: " + cookiesSorted[cookiesPointer]);

            if (childrenSorted[childrenPointer] <= cookiesSorted[cookiesPointer]) {
                counter++;
                childrenPointer++;
                cookiesPointer++;
            } else {
                cookiesPointer++;
            }
        }

        return counter;
    }
}
