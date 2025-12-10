package array.basics;

import org.w3c.dom.ls.LSOutput;

public class arr3 {
    public static void main(String args[]) {
        int arr[] = {4, 9, 2, 7, 1, 6, 3};
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < large) {
                large = arr[i];
            }
        }
        System.out.println("smallest is "  + large);
    }
}
