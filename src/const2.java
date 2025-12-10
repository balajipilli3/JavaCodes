 class B
 {
    B()
    {
        System.out.println("hi");
    }
    B(int a)
    {
        System.out.println(a);
    }
}
public class const2 {
    public static void main (String[] args){
        B obj=new B();
        B obj2=new B(3);
    }
}

