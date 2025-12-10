class a{
    public void demo()
    {
        System.out.println("hello");
    }
}
class b extends  a {
    public void demo1()
    {
        System.out.println("hello child");
    }
}

public class single_I {
    public static void main() {
        b obj=new b();
        obj.demo();
        obj.demo1();

    }

}
