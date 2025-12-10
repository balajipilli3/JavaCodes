package collections.framework;

import java.util.Stack;

public class stack1 {
    public static void main(String args[]){
        Stack<Integer> num=new Stack<>();
        num.push(9);
        num.push(8);
        num.push(2);
        System.out.println(num);
        num.pop();
        System.out.println(num);
    }
}
