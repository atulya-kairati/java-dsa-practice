package stacks;

public interface Stack<T> {
    public void push(T element);

    public T top();

    public T pop();

    public int size();
}
