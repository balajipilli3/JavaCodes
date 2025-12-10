package Constructors;
import java.util.Scanner;

class TataStrive {
    String courseName;
    String batchId;
    int duration;

    TataStrive(String cName, String bId, int dur) {
        courseName = cName;
        batchId = bId;
        duration = dur;
    }
    public void TsDetails(String address, String phoneNo) {
        System.out.println("Course Name: " + courseName);
        System.out.println("Batch ID: " + batchId);
        System.out.println("Duration: " + duration);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNo);
    }
}

public class details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String cName = sc.nextLine();
        System.out.print("Enter Batch ID: ");
        String bId = sc.nextLine();
        System.out.print("Enter Duration: ");
        int dur = sc.nextInt();

        TataStrive ts1 = new TataStrive(cName, bId, dur);
        sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNo = sc.nextLine();

        ts1.TsDetails(address, phoneNo);
    }
}