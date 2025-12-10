import org.w3c.dom.ls.LSOutput;

class outer4
{
    void demo8()
    {


        class inner4
        {
          void demo9()
            {
                System.out.println("method inner class");
            }
        }
        inner4 obj2=new inner4();
        obj2.demo9();
    }
}

public class localinner1 {
    public static void main(String[] args){
        outer4 obj3=new outer4();
        obj3.demo8();
    }
}
