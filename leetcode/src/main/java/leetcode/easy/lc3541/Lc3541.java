package leetcode.easy.lc3541;

import java.util.HashMap;
import java.util.Map;

public class Lc3541 {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vowelMap = new HashMap<>();
        Map<Character, Integer> consonantsMap = new HashMap<>();
        int vowel = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) >= 0) {
                vowelMap.put(s.charAt(i), vowelMap.getOrDefault(s.charAt(i), 0) + 1);
            } else {
                consonantsMap.put(s.charAt(i), consonantsMap.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        for (int value : vowelMap.values()) {
            if (value > vowel) {
                vowel = value;
            }
        }

        for (int value : consonantsMap.values()) {
            if (value > consonants) {
                consonants = value;
            }
        }

        return vowel + consonants;
    }
}
