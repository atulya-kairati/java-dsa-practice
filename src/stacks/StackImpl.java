package stacks;

import java.util.ArrayList;
import java.util.List;

class StackWithArray<T> implements Stack<T> {
    private final List<T> list = new ArrayList<>();

    @Override
    public void push(T element){
        list.add(element);
    }

    @Override
    public T top(){
        if(list.size() == 0) return null;

        return list.get(list.size() - 1);
    }

    @Override

    public T pop(){
        if(list.size() == 0) return null;

        return list.remove(list.size() - 1);
    }

    @Override
    public int size(){
        return list.size();
    }

    @Override
    public String toString() {
        return "StackWithArray" + list;
    }
}

class StackWithArrayMain{
    public static void main(String[] args) {
        Stack<String> stack = new StackWithArray<>();

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        stack.push("Manus");
        stack.push("Guts");
        stack.push("Bing Chilling");
        stack.push("MCBC");

        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.size());

        System.out.println(stack);
    }
}
