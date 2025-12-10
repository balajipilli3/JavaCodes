import java.util.Scanner;
public class armstrong1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int b =n;
        int r = 0;


        while (n != 0) {
            int a = n % 10;
            r = r + a*a*a;
            n = n / 10;



        }
        if (b == r) {

            System.out.println(b + " is armstrong");

        }
        else {
            System.out.println(b +  " is not a armstrong");
        }
    }
}
