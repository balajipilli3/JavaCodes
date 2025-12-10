import java.util.Scanner;

public class condlader {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n = sc.nextInt();

            if (n > 0) {
                System.out.println("positive");
            } else if (n < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("num is zero");
            }
        }
}
