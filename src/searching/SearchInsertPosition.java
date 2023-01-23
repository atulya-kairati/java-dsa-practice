package searching;

public class SearchInsertPosition {
    public static int solution(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end){
            mid = (start + end)/2;

            if (target > nums[mid]){
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else return mid;
        }
//        System.out.println(start + ", " + end);
        return start;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 12, 34, 53, 74, 90}, 5));
    }
}
