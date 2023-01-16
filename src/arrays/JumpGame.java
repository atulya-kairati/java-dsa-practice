package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Leetcode: 55
 */
class JumpGame {

    public static boolean canJump(List<Integer> arr) {
        int maxReachable = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {

            if (i > maxReachable) {
                return false;
            }
            if (i + arr.get(i) > maxReachable) {
                maxReachable = i + arr.get(i);
            }
        }

        return maxReachable > arr.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        System.out.println(JumpGame.canJump(arr));
    }
}