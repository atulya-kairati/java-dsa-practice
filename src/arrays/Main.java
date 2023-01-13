package arrays;

import java.util.Random;

public class Main {
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
