package stacks;

import linkedList.LinkedList;

class StackWithLL<T> implements Stack<T>{

    LinkedList<T> ll = new LinkedList<>();

    @Override
    public void push(T element) {
        ll.append(element);
    }

    @Override
    public T top() {
        return ll.get(ll.length() - 1);
    }

    @Override
    public T pop() {
        return ll.pop();
    }

    @Override
    public int size() {
        return ll.length();
    }
}

class StackWithLLMain{
    public static void main(String[] args) {
        Stack<String> stack = new StackWithLL<>();

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
