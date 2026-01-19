package leetcode.easy.lc0021;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc0021Test {

    private ListNode build(int... vals) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int values : vals) {
            current.next = new ListNode(values);
            current = current.next;
        }

        return dummy.next;
    }

    private int[] toArray(ListNode node) {
        List<Integer> nodeArray = new ArrayList<>();

        while (node != null) {
            nodeArray.add(node.val);
            node = node.next;
        }

        return nodeArray.stream().mapToInt(i -> i).toArray();
    }

    private final Lc0021 solution = new Lc0021();

    @Test
    void mergeTwoListsExample1() {
        ListNode list1 = build(1, 2, 4);
        ListNode list2 = build(1, 3, 4);
        int[] expected = { 1, 1, 2, 3, 4, 4 };

        int[] result = toArray(solution.mergeTwoLists(list1, list2));
        assertArrayEquals(expected, result);
    }

    @Test
    void mergeTwoListsExample2() {
        ListNode list1 = build();
        ListNode list2 = build();
        int[] expected = {};

        int[] result = toArray(solution.mergeTwoLists(list1, list2));
        assertArrayEquals(expected, result);
    }

    @Test
    void mergeTwoListsExample3() {
        ListNode list1 = build();
        ListNode list2 = build(0);
        int[] expected = { 0 };

        int[] result = toArray(solution.mergeTwoLists(list1, list2));
        assertArrayEquals(expected, result);
    }

    @Test
    void list1GreaterThanList2() {
        ListNode list1 = build(5, 5, 7, 10);
        ListNode list2 = build(1, 6, 15, 20);
        int[] expected = { 1, 5, 5, 6, 7, 10, 15, 20 };
        int[] result = toArray(solution.mergeTwoLists(list1, list2));

        assertArrayEquals(expected, result);
    }

    @Test
    void list2GreaterThanList1() {
        ListNode list1 = build(0, 2, 4, 5, 10);
        ListNode list2 = build(7, 10, 24, 33);
        int[] expected = { 0, 2, 4, 5, 7, 10, 10, 24, 33 };
        int[] result = toArray(solution.mergeTwoLists(list1, list2));

        assertArrayEquals(expected, result);
    }

    @Test
    void list1LongerThanList2() {
        ListNode list1 = build(0, 0, 1, 4, 6, 7, 11, 23);
        ListNode list2 = build(4, 5);
        int[] expected = { 0, 0, 1, 4, 4, 5, 6, 7, 11, 23 };
        int[] result = toArray(solution.mergeTwoLists(list1, list2));

        assertArrayEquals(expected, result);
    }

    @Test
    void list2LongerThanList1() {
        ListNode list1 = build(4, 5);
        ListNode list2 = build(0, 0, 1, 4, 6, 7, 11, 23);
        int[] expected = { 0, 0, 1, 4, 4, 5, 6, 7, 11, 23 };
        int[] result = toArray(solution.mergeTwoLists(list1, list2));

        assertArrayEquals(expected, result);
    }
}
