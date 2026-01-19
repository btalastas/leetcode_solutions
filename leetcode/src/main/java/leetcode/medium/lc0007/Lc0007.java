package leetcode.medium.lc0007;

import java.util.LinkedList;
import java.util.Queue;

public class Lc0007 {

    public int reverse(int x) {

        Queue<Integer> reversed = new LinkedList<>();

        int result = 0;
        while (x != 0) {
            int remainder = x % 10;

            x /= 10;
            reversed.add(remainder);
        }

        if (reversed.size() > 10) {

            return 0;
        }

        if (reversed.isEmpty()) {
            return 0;
        }
        int head = reversed.peek();

        while (!reversed.isEmpty()) {
            result = result * 10 + reversed.poll();
        }

        int checkHead = result;

        while (Math.abs(checkHead) >= 10) {
            checkHead /= 10;
        }

        if ((head != checkHead && head != 0) || result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }

        return result;
    }
}
