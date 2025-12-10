import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int b =n;
        int r = 0;
        while (n != 0) {
            int a = n % 10;
            r = r * 10 + a;
            n = n / 10;

        }
        if (b == r) {

            System.out.println(b + " is palindrome");

        }
        else {
            System.out.println(b +  " is not a palindrome");
        }
    }
}
