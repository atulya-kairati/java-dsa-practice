package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] solution(int[] arr){
        int len = arr.length;

        for (int i = 0; i < len - 1; i++){
            int minIndex = i;
            for (int j = i; j < len; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            // swap minIndex and current i
            int t = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = t;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 3, 5, 73, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1,0,1,0,1,0,1})));
        System.out.println(Arrays.toString(solution(new int[]{4,9,4,2,5,85,3,0,2,4,5,8})));
    }
}
