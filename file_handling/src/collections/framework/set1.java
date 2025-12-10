package collections.framework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set1 {
    static void main(String[] args) {
        TreeSet<Integer> hash = new TreeSet<>();
        hash.add(30);
        hash.add(1);
        hash.add(0);
        hash.add(3);
        hash.add(5);
        hash.add(85);
        hash.add(22);
        System.out.println(hash);
        hash.remove(85);
        System.out.println(hash.hashCode());
        System.out.println(hash.iterator());
    }
}