import java.util.Scanner;
class person{
    public void details(String name,int age){
        System.out.println(name+"    "+age);

    }
}
public class usermethods3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter person details");
        String name=sc.nextLine();
        int age=sc.nextInt();

        person p=new person();
        p.details(name,age);
    }
}