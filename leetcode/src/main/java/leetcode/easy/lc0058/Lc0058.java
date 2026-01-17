package leetcode.easy.lc0058;

public class Lc0058 {
    public int lengthOfLastWord(String s) {

        int length;

        String[] text = s.split("\\s+");

        length = text[text.length - 1].length();

        return length;

    }
}
