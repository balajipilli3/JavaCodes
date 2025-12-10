package collection_frameowrk;

import java.util.LinkedList;
import java.util.Vector;

public class vet1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Vector<Integer> list = new Vector<Integer>();

        list.add(99);
        list.add(02);
        list.add(56);
        list.add(79);
        list.add(00);

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2) + " index");
        System.out.println(list.indexOf(2) + " index");

        list.addFirst(49);
        list.addLast(412);
        list.add(2, 23);

        System.out.println(list);
        System.out.println(list.contains(412));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.indexOf(412));
        list.remove(2);
        System.out.println(list);
        System.out.println(list.capacity());
        System.out.println(list.firstElement());
    }

}