package arrays.basics.programs;
import java.util.Scanner;

public class arrdigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();

        int[] newArray =new int[size];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sc.nextInt();
        }


        System.out.println("Enter the number for which u want to know the Repetations : ");
        int ele = sc.nextInt();

        int count = 0;
        for (int i = 0 ; i < newArray.length; i++)
        {
            if ( newArray[i]==ele)
            {
                count++;
            }

        }
        System.out.println("The Repetations of Number " + ele + " is : " +  count);
    }
}