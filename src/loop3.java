import java.util.Scanner;
public class loop3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int i=sc.nextInt();
        do {
            System.out.println(i);
            i++;
        }
        while(i<=4);


    }
}
