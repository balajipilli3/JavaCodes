import java.util.Scanner;

public class cond3if {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        if (a>=0)
        {
            System.out.println("Positive");
        } else {
            System.out.println("negative");
        }
    }
}
