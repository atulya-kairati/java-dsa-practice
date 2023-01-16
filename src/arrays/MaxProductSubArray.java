package arrays;

import java.util.List;

/**
 * Leetcode: 152
 * <p>
 * Hint: The max product sub-array is always either
 * a suffix or a prefix
 */
public class MaxProductSubArray {
    static int getMaxProductSubArray(List<Integer> nums) {
        int answer = Integer.MIN_VALUE;
        if (nums.size() == 1) {
            return nums.get(0);
        }

        int currentProduct = 1;
        for (int i = 0; i < nums.size(); i++) {

            currentProduct *= nums.get(i);

            if(currentProduct > answer){
                answer = currentProduct;
            }

            if(nums.get(i) == 0) {
                currentProduct = 1;
            }
        }

        currentProduct = 1;
        for (int i = nums.size() - 1; i >= 0; i--) {
            currentProduct *= nums.get(i);

            if(currentProduct > answer){
                answer = currentProduct;
            }

            if(nums.get(i) == 0) {
                currentProduct = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(getMaxProductSubArray(List.of(-2, 0, -1)));
    }
}
