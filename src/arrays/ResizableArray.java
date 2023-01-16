package arrays;

import java.util.Random;

public class ResizableArray{

    int size, capacity;
    int[] array;

    ResizableArray(){
        this.capacity = 2;
        this.size = 0;

        array = new int[capacity];
    }

    void push(int e) {
        if(size < capacity){
            array[size++] = e;
            return;
        }

        capacity *= 2;
        int[] newArray = new int[capacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        newArray[size++] = e;

        this.array = newArray;
    }

    @Override
    public String toString() {
        String res = "ResizableArray[ ";

        for(int i = 0; i < size; i++){
            res += array[i] + ", ";
        }
        return res + "]";
    }

}

class Main {
    public static void main(String[] args) {
        ResizableArray ra = new ResizableArray();

        for (int i = 0; i < 65; i++) {
            ra.push(new Random().nextInt(100));
        }

        System.out.println(ra);
        System.out.println(ra.size);
        System.out.println(ra.capacity);
    }
}
