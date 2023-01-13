package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given an array, find the contiguous sub-array
 * with max sum and print the sum.
 */
public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }


        System.out.println(arr);

        int maxSoFar = arr.get(0);

        int currentSum = 0;

        for (int e : arr) {
            currentSum += e;
            if (currentSum < 0) {
                currentSum = 0;
            } else if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }

        }

        System.out.println(maxSoFar);
    }
}
