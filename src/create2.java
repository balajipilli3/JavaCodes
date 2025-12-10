import java.io.FileOutputStream;
import java.io.File;

public class create2 {
    static void main(String[] args) {
        String s="four.png";
        try( FileOutputStream obj=new FileOutputStream(s)){

            System.out.println("File created scucessfully");

        }
        catch (Exception e) {
            System.out.println("File failed to create");
        }
    }
}