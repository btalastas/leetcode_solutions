package leetcode.easy.lc1281;

public class Lc1281 {
    public int subtractProductAndSum(int n) {

        int length = (int) (Math.log10(n) + 1);

        int[] intArray = new int[length];

        int difference = 0;

        int counter = 0;

        while (n != 0) {

            int lastDigit = n % 10;

            intArray[counter] = lastDigit;

            counter++;

            n /= 10;

        }

        int product = 1;

        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {

            product *= intArray[i];

            sum += intArray[i];

            if (i == intArray.length - 1) {

                difference = product - sum;

            }

        }

        return difference;

    }
}
