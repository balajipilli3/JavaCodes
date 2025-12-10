class A1{
    public void demo()
    {
        System.out.println("grand parent");
    }
}
class B1 extends  A1 {
    public void demo1()
    {
        System.out.println("parent");
    }
}
class C extends B1 {
    public void demo2()
    {
        System.out.println("Child");
    }
}

public class multilevel1 {
    public static void main() {
        C obj=new C();
        obj.demo();
        obj.demo1();
        obj.demo2();

    }

}
