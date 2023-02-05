package sorting;

import java.util.*;

/**
 *
 */
public class GroupAnagram {
    public static List<List<String>> solution(String[] strs){
        List<List<String>> ans = new ArrayList<>();

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);

            String sortedWord = new String(charArr);

            if(anagramMap.containsKey(sortedWord)) {
                anagramMap.get(sortedWord).add(word);
            }

            else {
                List<String> newList = new ArrayList<>();
                newList.add(word);
                anagramMap.put(sortedWord, newList);
            }
        }

        for (List<String> vl: anagramMap.values()){
            ans.add(vl);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}

