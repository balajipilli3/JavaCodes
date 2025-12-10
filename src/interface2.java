interface Add{
    int a=12;
    static int b=34;
    final int c=56;

}
public class interface2 {
    public static void main(String[] args) {
        System.out.println(Add.a+Add.b*Add.c);
        System.out.println(Add.a);
        System.out.println(Add.b);
        System.out.println(Add.c);

    }
}