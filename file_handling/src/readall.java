import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class readall {
    public static void main(String args[]) {
        try
        {
            List<String> list = Files.readAllLines(Paths.get("six.txt"));
            for(String s: list){
                System.out.println(s);

            }

        }
        catch (Exception e)
        {
            System.out.println(e);

        }
    }
}
