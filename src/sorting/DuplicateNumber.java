package sorting;

/**
 * Leetcode: 287m
 */
public class DuplicateNumber {
    public static int solution(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        int ans = 1;
        while(start <= end){
            int mid = (start + end)/2;

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] <= mid) count++;
            }

            if(count <= mid){
                start = mid + 1;
            }
            else {
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,4,2,2}));
    }
}
