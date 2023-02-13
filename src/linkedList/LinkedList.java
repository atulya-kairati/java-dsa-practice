package linkedList;

class Node<T>{
    T value;
    Node<T> next = null;

    Node(){}

    Node(T value){
        this.value = value;
    }
}
public class LinkedList<T> {

    private Node<T> head, tail;
    private int size = 0;

    public void append(T value){
        Node<T> newNode = new Node<>(value);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;

            return;
        }

        tail.next = newNode;
        tail = tail.next;
    }

    public void appendFront(T value){
        if(head == null){
            append(value);
            return;
        }

        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T get(int index){
        if (head == null || index >= size) return null;

        Node<T> ptr = head;

        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }

        return ptr.value;
    }

    public T delete(int index){
        if (head == null || index >= size) return null;

        Node<T> ptr = head, oneBefore = null;

        for (int i = 0; i < index; i++) {
            oneBefore = ptr;
            ptr = ptr.next;
        }

        Node<T> deletedNode = ptr;

        if (oneBefore == null){
            head = deletedNode.next;
        }
        else {
            oneBefore.next = ptr.next;
        }


        deletedNode.next = null;

        size--;

        return deletedNode.value;
    }

    public T pop(){
        return delete(size - 1);
    }

    public T popFront(){
        return delete(0);
    }

    public void print(){
        Node<T> ptr = head;

        while (ptr != null){
            System.out.print(ptr.value + "->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public int length(){
        return size;
    }
}

class LinkedListMain{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.print();

        System.out.println(ll.popFront());
        ll.print();

        System.out.println(ll.popFront());
        ll.print();

        System.out.println(ll.popFront());
        ll.print();

        System.out.println(ll.popFront());
        ll.print();

        System.out.println(ll.popFront());
        ll.print();



    }
}