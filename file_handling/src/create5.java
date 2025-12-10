import java.io.File;
import java.io.FileOutputStream;
public class create5 {
    public static void main(String[] args) {
        String content="hello world";

        try(FileOutputStream obj=new FileOutputStream("file1.txt")){
            System.out.println("file created sucsessfully");
            byte[] bytes=content.getBytes();
            obj.write(bytes);
            System.out.println("printed Sucsessfully");

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
