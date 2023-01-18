package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] solution(int[] arr){
        int len = arr.length;

        for (int i = 0; i < len; i++){
            for (int j = 0; j < len-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    // swap them
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 3, 5, 73, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1,0,1,0,1,0,1})));
        System.out.println(Arrays.toString(solution(new int[]{4,9,4,2,5,85,3,0,2,4,5,8})));
    }
}
