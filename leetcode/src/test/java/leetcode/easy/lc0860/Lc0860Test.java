package leetcode.easy.lc0860;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Lc0860Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: bills = [5,5,5,10,20]
     * Output: true
     * Explanation:
     * From the first 3 customers, we collect three $5 bills in order.
     * From the fourth customer, we collect a $10 bill and give back a $5.
     * From the fifth customer, we give a $10 bill and a $5 bill.
     * Since all customers got correct change, we output true.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: bills = [5,5,10,10,20]
     * Output: false
     * Explanation:
     * From the first two customers in order, we collect two $5 bills.
     * For the next two customers in order, we collect a $10 bill and give back a $5
     * bill.
     * For the last customer, we can not give the change of $15 back because we only
     * have two $10 bills.
     * Since not every customer received the correct change, the answer is false.
     * ```
     */

    private final Lc0860 lc0860 = new Lc0860();

    @Test
    void lemonadeChangeExample1() {
        int[] bills = { 5, 5, 5, 10, 20 };
        assertTrue(lc0860.lemonadeChange(bills));
    }

    @Test
    void lemonadeChangeExample2() {
        int[] bills = { 5, 5, 10, 10, 20 };
        assertFalse(lc0860.lemonadeChange(bills));
    }

}
