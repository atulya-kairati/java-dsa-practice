package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode: 238
 */
public class ProductOfArrayExceptSelf {
    static List<Integer> solution(List<Integer> l){

        List<Integer> leftProductArr = new ArrayList<>(l);
        for (int i = 1; i < l.size(); i++) {
            leftProductArr.set(i, leftProductArr.get(i - 1) * leftProductArr.get(i));
        }

        List<Integer> rightProductArr = new ArrayList<>(l);
        for (int i = l.size() - 2; i >= 0; i--) {
            rightProductArr.set(i, rightProductArr.get(i + 1) * rightProductArr.get(i));
        }

        List<Integer> answers = new ArrayList<>(l.size());
        for (int i = 0; i < l.size(); i++) {
            if(i == 0){
                answers.add(rightProductArr.get(i + 1));
                continue;
            }
            if(i == l.size() - 1){
                answers.add(leftProductArr.get(i - 1));
                continue;
            }

            answers.add(leftProductArr.get(i-1) * rightProductArr.get(i + 1));

        }

        return answers;
    }

    public static void main(String[] args) {
        System.out.println(solution(List.of(1, 2, 3, 4)));
        System.out.println(solution(List.of(-1, 1, 0, 3, -3)));
    }
}
