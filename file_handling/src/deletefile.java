import java.io.File;

public class deletefile {
    public static void main(String args[]){

        File obj=new File("logical.java");
        if(obj.exists())
        {
            if(obj.delete())
            {
                System.out.println("file deleted");
            }
            else {
                System.out.println("file unable to delete");
            }
        }
        else {
            System.out.println("file not avalable");
        }

    }
}
