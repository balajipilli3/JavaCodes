package collections.framework;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class arrdeq1 {
    public static void main(String []args) {
        ArrayDeque<Integer> num = new ArrayDeque<>();
        num.offer(3);
        num.offer(5);
        num.offer(2);
        num.offer(9);
        num.push(8);
        num.push(2);
        System.out.println(num);
        num.poll();
        System.out.println(num);
        num.pop();
        System.out.println(num);
    }

}
