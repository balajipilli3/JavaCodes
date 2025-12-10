import java.io.File;
public class create1 {
    public static void main(String[] args) {
        File obj = new File("create2.txt");
        try {
            if (obj.createNewFile()) {
                System.out.println("file created sucsessfully");
            } else {
                System.out.println("file not created");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}