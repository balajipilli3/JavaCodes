package arrays.basics.programs;
import java.util.Scanner;

public class arrdigits2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();

        int[] newArray = new int[size];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sc.nextInt();
        }

        int start = 0;
        int end = newArray.length - 1;


        while (start < end) {
            int temp = newArray[start];
            newArray[start] = newArray[end];
            newArray[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for (int k = 0; k < newArray.length; k++) {
            System.out.print(newArray[k] + " ");
        }

        sc.close();
    }
}