package collections.framework;

import java.util.PriorityQueue;
import java.util.Stack;

public class que1 {
    public static void main(String []args) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.offer(3);
        num.offer(5);
        num.offer(2);
        num.offer(9);
        System.out.println(num);
        num.poll();
        System.out.println(num);
    }

}
