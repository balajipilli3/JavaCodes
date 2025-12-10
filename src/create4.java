import java.io.File;
import java.io.FileWriter;
public class create4 {
    public static void main(String args[]){
        File obj=new File("six.txt");
        try{
            if(obj.createNewFile())
            {
                System.out.println("file created");
            }
            else
            {
                System.out.println("failed to create");
            }
            FileWriter obj1=new FileWriter("six.txt");
            obj1.write("banglore is capital");
            obj1.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
 }
