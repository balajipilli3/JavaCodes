import java.util.Scanner;
public class loopeq3 {
    static void main(String[] args) {
        for(int i=4;i>=1;i--)
        {
            for(int j=i;j<=4;j++)
            {

                System.out.print("   ");
            }
            for(int j=1;j<=(2 * i -1);j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
