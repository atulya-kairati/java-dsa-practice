package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode: 338
 */
public class CountSetBit {
    static List<Integer> getSetBitList(int num){
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i <= num; i++) {
            int n = i;
            int c = 0;
            while(n > 0){
                if((n & 1) == 1){
                    c++;
                }
                n = n >> 1;
            }
            l.add(c);
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(getSetBitList(31 ));
    }
}
