package collections.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class arrlist {
    public static void main(String args[]) {
        List list = new ArrayList<>();
        list.add("balaji");
        list.add(5015);
        list.add(10.1f);
        System.out.println(list);
        list.add(1, "Pilli");

        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        System.out.println(list.getLast());
        System.out.println(list.getFirst());

        System.out.println(list.set(1, "MCA") + " set");

        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains("Jamadar"));

        System.out.println(list.remove(2) + " removed");

        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}


        /*
         * add : add the element after the last index
         * remove(3) : remove the element from given index
         * getLast : to get last element
         * getFirst : gives first element
         * get(1) : get the element at the indexed value given
         * seize() : size of the list
         * contains() : checks if the elements contains or not
         * addfirst : add at 1st index
         * addlast : add at last index
         * clear : clear all the elements
         * isEmpty() : check weather the list is empty or not
         *
         * */