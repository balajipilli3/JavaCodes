package arrays.basics.programs;
import java.util.Scanner;

public class arrsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();

        int[] myArray =new int[size];
        int sum=0;


        System.out.println("Enter the array elements : ");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        System.out.println("The elements in the array are : ");

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];


        }
        System.out.println("sum" +sum);
        sc.close();
        int avg=sum/size;
        System.out.println("avg" +avg);
    }
}