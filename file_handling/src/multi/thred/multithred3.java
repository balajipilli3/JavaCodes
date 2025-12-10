package multi.thred;

class j3 implements Runnable
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
            //System.out.println("wait");
        }
    }

}
class j4 implements Runnable
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
public class multithred3 {
    public static void main(String []args){

        j3 obj1=new j3();
        j4 obj2=new j4();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

    }
}

