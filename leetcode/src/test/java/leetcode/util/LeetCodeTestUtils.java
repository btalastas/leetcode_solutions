package leetcode.util;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class LeetCodeTestUtils {

    // Prevent instantiation
    private LeetCodeTestUtils() {
    }

    /*
     * =======================
     * Primitive return types
     * =======================
     */

    public static void assertInt(int expected, int actual) {
        assertEquals(expected, actual);
    }

    public static void assertBoolean(boolean expected, boolean actual) {
        assertEquals(expected, actual);
    }

    public static void assertString(String expected, String actual) {
        assertEquals(expected, actual);
    }

    /*
     * =======================
     * Array return types
     * =======================
     */

    public static void assertIntArray(int[] expected, int[] actual) {
        assertArrayEquals(expected, actual);
    }

    public static void assertStringArray(String[] expected, String[] actual) {
        assertArrayEquals(expected, actual);
    }

    public static void assertAnyOrder(int[] expected, int[] actual) {
        assertNotNull(actual);
        assertEquals(expected.length, actual.length);

        int[] e = Arrays.copyOf(expected, expected.length);
        int[] a = Arrays.copyOf(actual, actual.length);

        Arrays.sort(e);
        Arrays.sort(a);

        assertArrayEquals(e, a);
    }

    /*
     * =======================
     * Collection return types
     * =======================
     */

    public static <T> void assertListEquals(List<T> expected, List<T> actual) {
        assertEquals(expected, actual);
    }

    public static <T> void assertListAnyOrder(List<T> expected, List<T> actual) {
        assertNotNull(actual);
        assertEquals(expected.size(), actual.size());
        assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
    }

    /*
     * =======================
     * Matrix return types
     * =======================
     */

    public static void assertMatrix(int[][] expected, int[][] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    /*
     * =======================
     * Null / empty helpers
     * =======================
     */

    public static void assertEmpty(int[] arr) {
        assertNotNull(arr);
        assertEquals(0, arr.length);
    }

    public static void assertNotEmpty(int[] arr) {
        assertNotNull(arr);
        assertTrue(arr.length > 0);
    }
}
