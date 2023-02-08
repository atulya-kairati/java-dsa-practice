package maps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] solution(int[] arr, int target){
        int[] ans = new int[2];

        Map<Integer, Integer> diffMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            diffMap.put(target - arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {

            Integer idx = diffMap.get(arr[i]);

            if (idx != null && idx != i){
                ans[0] = i;
                ans[1] = diffMap.get(arr[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
