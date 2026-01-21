package leetcode.easy.lc0171;

public class Lc0171 {

    private int value(char letter) {
        int value = 0;

        switch (letter) {
            case 'A' -> {
                value = 1;
            }
            case 'B' -> {
                value = 2;
            }
            case 'C' -> {
                value = 3;
            }
            case 'D' -> {
                value = 4;
            }
            case 'E' -> {
                value = 5;
            }
            case 'F' -> {
                value = 6;
            }
            case 'G' -> {
                value = 7;
            }
            case 'H' -> {
                value = 8;
            }
            case 'I' -> {
                value = 9;
            }
            case 'J' -> {
                value = 10;
            }
            case 'K' -> {
                value = 11;
            }
            case 'L' -> {
                value = 12;
            }
            case 'M' -> {
                value = 13;
            }
            case 'N' -> {
                value = 14;
            }
            case 'O' -> {
                value = 15;
            }
            case 'P' -> {
                value = 16;
            }
            case 'Q' -> {
                value = 17;
            }
            case 'R' -> {
                value = 18;
            }
            case 'S' -> {
                value = 19;
            }
            case 'T' -> {
                value = 20;
            }
            case 'U' -> {
                value = 21;
            }
            case 'V' -> {
                value = 22;
            }
            case 'W' -> {
                value = 23;
            }
            case 'X' -> {
                value = 24;
            }
            case 'Y' -> {
                value = 25;
            }
            case 'Z' -> {
                value = 26;
            }
        }

        return value;
    }

    public int titleToNumber(String columnTitle) {
        char[] columnTitleArray = columnTitle.toCharArray();
        int number = 0;
        int position = columnTitleArray.length - 1;
        for (int i = 0; i < columnTitleArray.length; i++) {
            number += value(columnTitleArray[i]) * (Math.pow(26, position));
            position--;
        }

        return number;
    }
}
