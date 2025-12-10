import java.util.Scanner;

public class switch2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks(0-100)");
        int marks = sc.nextInt();

        switch (marks)
        {
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            case 60:
                System.out.println("B");
                break;
            case 50:
                System.out.println("E");
                break;
            case 40:
                System.out.println("fail");
                break;

            default:
                System.out.println("enter the valid number");

        }
    }

}
