package arrays;

public class MaxConsecutiveOnes {
    public static int solution(int[] arr) {
        int c = 0;
        int maxc = 0;

        for (int e : arr) {
            if (e == 1) c++;
            else c = 0;

            maxc = Math.max(maxc, c);
        }
        return maxc;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 0, 1, 1, 0, 1}));
        System.out.println(solution(new int[]{1}));
    }
}
