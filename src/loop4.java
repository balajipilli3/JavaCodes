import java.util.Scanner;
public class loop4 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        do {
            System.out.println(n);
            n+=2;
        }
        while(n<20);


    }
}
