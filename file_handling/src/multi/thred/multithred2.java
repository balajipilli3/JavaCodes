package multi.thred;

import java.sql.SQLOutput;

class j1 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("react");
            try
            {
                Thread.sleep(5000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("wait");
        }
    }

}
class j2 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("java");
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

}
public class multithred2 {
    public static void main(String []args){

        j1 obj1=new j1();
        j2 obj2=new j2();

        obj1.start();
        obj2.start();

    }
}
