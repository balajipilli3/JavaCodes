class B16
{
    private class B17
    {
       public void method()
       {
           System.out.println("inner class");

       }
    }
    void details()
    {
        B17 obj=new B17();
        obj.method();
    }
}

public class innerclass1 {
    public static void main(String[] args){
        B16 obj1=new B16();
        obj1.details();
        //B16.B17 obj=new B16.B17();
    }

}
