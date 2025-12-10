package arrays.basics.programs;
import java.util.Scanner;

public class instarr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();

        int[] myArray =new int[size];

        System.out.println("Enter the array elements : ");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        System.out.println("The elements in the array are : ");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        sc.close();
    }
}