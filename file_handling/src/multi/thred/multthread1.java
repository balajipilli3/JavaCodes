package multi.thred;
class multi extends Thread
{
    @Override
    public void run()
    {
        System.out.println("thread 1");
    }


}
class multi2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("thread 2 ");
    }


}
public class multthread1 {
    public static void main(String args[]){
        multi obj=new multi();
        obj.start();
        System.out.println("pilli");
        multi2 obj1=new multi2();
        obj1.start();

    }
}
