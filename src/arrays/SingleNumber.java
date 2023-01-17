package arrays;

/**
 * Leetcode: 136
 */
public class SingleNumber {
    public static int solution(int[] arr) {
        int ans = 0;

        for (int e : arr) {
            ans ^= e;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 1, 3, 3, 4, 2}));
    }
}
