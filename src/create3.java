import java.nio.file.Files;
import java.nio.file.Paths;

public class create3 {
    static void main(String[] args) {
        String s="C:\\Users\\User\\Downloads\\JFSJD00001-20251118T044551Z-1-001-20251202T042520Z-1-001\\File Handling/two.txt";
        try{
            Files.write(Paths.get(s),"Hello Java Programmers".getBytes());
            System.out.println("File has been modified");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}