package arrays;

import java.util.Arrays;

/**
 * Leetcode: 283
 */
public class ZerosToBack {
    public static int[] solution(int[] arr){
        int movingPtr = 0;
        int zeroPtr = 0;

        while (true){

            if(arr[zeroPtr] != 0) zeroPtr++;

            movingPtr++;
            if(movingPtr >= arr.length) break;

            if (arr[movingPtr] != 0 && arr[zeroPtr] == 0){
                int t = arr[zeroPtr];
                arr[zeroPtr] = arr[movingPtr];
                arr[movingPtr] = t;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 0, 1, 0, 3, 0, 2, 0, 0, 0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 0, 3, 12})));
        System.out.println(Arrays.toString(solution(new int[]{0})));
    }
}
