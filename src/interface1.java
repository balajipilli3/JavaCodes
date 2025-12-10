interface A6{
    void greet();
}
class d5 implements A6{
    public void greet()
    {
        System.out.println("intrerface in java ");
    }
}
public class interface1 {
    public static void main(String[] args) {
        d5 obj = new d5();
        obj.greet();
    }
}
