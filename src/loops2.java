import java.util.Scanner;
public class loops2{
    static void main(String[] args) {
        int a=4;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i == 1 || i == a || j == 1 || j == a) {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
