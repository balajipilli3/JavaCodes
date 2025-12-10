import java.io.File;
import java.io.FileOutputStream;

public class create6{
    public static void main(String[] args) {
        String s= "goood noon";
        try( FileOutputStream obj=new FileOutputStream("yassssshh.txt")){
            {
                byte[] bytes=s.getBytes();
                obj.write(bytes);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}