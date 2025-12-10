import java.util.Scanner;
public class loop5 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        do {
            System.out.println(n);
            n--;
        }
        while(n>=0);


    }
}
