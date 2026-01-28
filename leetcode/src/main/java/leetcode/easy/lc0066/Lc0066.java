package leetcode.easy.lc0066;

public class Lc0066 {

    private int[] carryAddition(int[] digits) {
        int[] carryArray;
        int index = digits.length - 1;
        boolean carry = true;

        if (digits.length == 1) {
            carryArray = new int[digits.length + 1];
            carryArray[0] = 1;
            carryArray[1] = 0;
            return carryArray;
        }
        while (index >= 0 && carry) {

            if (digits[index] == 9) {
                digits[index] = 0;
            } else {
                digits[index]++;
                carry = false;
            }

            index--;
        }

        if (digits[0] == 0) {
            carryArray = new int[digits.length + 1];
            carryArray[0] = 1;
            carryArray[1] = 0;
            System.arraycopy(digits, 1, carryArray, 2, carryArray.length - 2);
            return carryArray;
        }
        carryArray = new int[digits.length];
        System.arraycopy(digits, 0, carryArray, 0, digits.length);

        return carryArray;

    }

    public int[] plusOne(int[] digits) {
        int[] array;

        if (digits[digits.length - 1] == 9) {
            return carryAddition(digits);

        }

        digits[digits.length - 1]++;
        array = digits;
        return array;

    }
}

// 99999
