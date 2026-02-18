package leetcode.easy.lc0693;

public class Lc0693 {
    public boolean hasAlternatingBits(int n) {

        int temp = n & 1;
        n >>= 1;

        while (n != 0) {
            int bit = n & 1;
            if (temp == bit) {
                return false;
            }
            temp = bit;
            n >>= 1;
        }

        return true;
    }
}
