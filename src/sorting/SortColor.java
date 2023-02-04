package sorting;

import java.util.Arrays;

/**
 * Leetcode: 75
 * <p>
 * An array consisting of 0, 1 and 2.
 * Sort it in place.
 * <p>
 * Approach:
 * Move the 0's to left and 2's to the right
 */
public class SortColor {
    public static int[] soluation(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int i = 0;
        while (i <= right) {
            if (arr[i] == 0) {
                // swap with left
                int t = arr[i];
                arr[i] = arr[left];
                arr[left] = t;
                left++;
            }

            if (arr[i] == 2) {
                // swap with right
                int t = arr[i];
                arr[i] = arr[right];
                arr[right] = t;
                right--;
                /**
                 * here we will not increment i since we might get swapped
                 * with a 0 at the current ith position and if we increment
                 * i we will skip the 0.
                 */
                continue;
            }
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(soluation(new int[]{2, 1, 0, 2, 0, 1})));
    }
}