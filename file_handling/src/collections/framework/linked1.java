package collection_frameowrk;

import java.util.LinkedList;

public class linked1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedList<String> list = new LinkedList<String>();

        list.add("range rover");
        list.add("Defender");
        list.add("hilx");
        list.add("kia");

        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));

        list.addFirst("alto");
        list.addLast("creta");

        System.out.println(list);

        System.out.println(list.contains("Sachin"));
        System.out.println(list.isEmpty());

        System.out.println(list.size());

        System.out.println(list.indexOf("alto"));

        list.remove();

        System.out.println(list);

        System.out.println(list.peek());
        list.poll();
        System.out.println(list);

        list.push("hariar n ");
        System.out.println(list);
        list.pop();

        list.offerFirst("Max");
        list.offerLast("Mark");
        System.out.println(list);
    }

}

        /*
         *
         * peak : return head i.e. 1st element
         * poll : removes the head i.e. 1st element
         * offer : adds element at last index
         * offerFirst : adds element at 1st
         * offerLast : adds element at last
         *
         * */







