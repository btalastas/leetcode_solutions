package leetcode.easy.lc3713;

public class Lc3713 {

    public int longestBalanced(String s) {

        int longest = 0, length = 0, distinct = 0, maxFreq = 0;

        if (s.length() == 0) {
            return longest;
        } else if (s.length() == 1) {
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            for (int j = i; j < s.length(); j++) {

                if (count[s.charAt(j) - 'a'] == 0) {
                    distinct++;
                    count[s.charAt(j) - 'a']++;

                } else {
                    count[s.charAt(j) - 'a']++;

                }
                maxFreq = Math.max(maxFreq, count[s.charAt(j) - 'a']);
                length++;
                if (length == distinct * maxFreq) {
                    longest = Math.max(longest, length);
                }
            }
            length = 0;
            distinct = 0;
            maxFreq = 0;
        }

        return longest;
    }
}
