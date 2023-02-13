package stacks;

import java.util.*;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean solution(String brackets){

        List<Character> opening = Arrays.asList('(', '[', '{');
        List<Character> closing = Arrays.asList(')', ']', '}');


        Stack<Character> balancingStack = new Stack();

        for (char bracket: brackets.toCharArray()) {
            if(opening.contains(bracket)){
                balancingStack.push(bracket);
            }
            if (closing.contains(bracket)){
                int id = closing.indexOf(bracket);
                if(balancingStack.size() == 0){
                    return false;
                }
                if(balancingStack.peek() != opening.get(id)){
                    return false;
                }
                balancingStack.pop();
            }
        }

        return balancingStack.size() == 0;
    }

    public static void main(String[] args) {

        System.out.println(solution("()([]){}"));

    }
}
