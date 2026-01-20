package leetcode.easy.lc0013;

import java.util.Map;

public class Lc0013 {

    public int romanToInt(String s) {
        int value = 0;
        char[] roman = s.toCharArray();
        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        for (int i = 0; i < roman.length; i++) {

            // New Rule Switch
            // switch (roman[i]) {
            // case 'I' -> {
            // if ((i + 1) < roman.length && roman[i + 1] == 'V') {
            // value += 4;
            // } else if ((i + 1) < roman.length && roman[i + 1] == 'X') {
            // value += 9;
            // }
            // i = i + 1;
            // }
            // case 'X' -> {
            // if ((i + 1) < roman.length && roman[i + 1] == 'L') {
            // value += 40;
            // } else if ((i + 1) < roman.length && roman[i + 1] == 'C') {
            // value += 90;
            // }
            // i = i + 1;
            // }
            // case 'C' -> {
            // if ((i + 1) < roman.length && roman[i + 1] == 'D') {
            // value += 400;
            // } else if ((i + 1) < roman.length && roman[i + 1] == 'M') {
            // value += 900;
            // }
            // i = i + 1;
            // }
            // default -> value += romanMap.get(roman[i]);
            // }

            switch (roman[i]) {
                case 'I':
                    if ((i + 1) < roman.length && roman[i + 1] == 'V') {
                        value += 4;
                        i = i + 1;
                    } else if ((i + 1) < roman.length && roman[i + 1] == 'X') {
                        value += 9;
                        i = i + 1;
                    } else {
                        value += romanMap.get(roman[i]);
                    }
                    break;
                case 'X':
                    if ((i + 1) < roman.length && roman[i + 1] == 'L') {
                        value += 40;
                        i = i + 1;
                    } else if ((i + 1) < roman.length && roman[i + 1] == 'C') {
                        value += 90;
                        i = i + 1;
                    } else {
                        value += romanMap.get(roman[i]);
                    }
                    break;
                case 'C':
                    if ((i + 1) < roman.length && roman[i + 1] == 'D') {
                        value += 400;
                        i = i + 1;
                    } else if ((i + 1) < roman.length && roman[i + 1] == 'M') {
                        value += 900;
                        i = i + 1;
                    } else {
                        value += romanMap.get(roman[i]);
                    }

                    break;
                default:
                    value += romanMap.get(roman[i]);
                    break;
            }

        }

        return value;
    }

}