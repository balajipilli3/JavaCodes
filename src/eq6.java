import java.util.Scanner;
public class eq6 {
    static void main(String[] args) {
        int n=5;

        //for(int i=1;i<=n;i++)
        for (int i = n; i >= 1; i--)//reverse
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
