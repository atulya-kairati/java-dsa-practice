package sorting;

import java.util.Arrays;

/**
 * Leetcode: 287
 * Find the majority element.
 * Majority element: which occurs more than N/2 times.
 * <p>
 * Approach 1: Make a frequency map.
 * Approach 2: Sort and the mid-element will be the majority one.
 */

public class MajorityElement {

    public static int solution(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 3, 2, 3, 4, 2, 4, 2, 2}));
    }
}
