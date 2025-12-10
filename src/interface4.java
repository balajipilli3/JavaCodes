interface D1{
    void add(int a,int b);
}
interface D2{
    void add(int c,int d);
}
class C1 implements D1,D2{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int c,int d){
        System.out.println(c-d);
    }
}
public class interface4 {
    public static void main(String[] args) {
        C1 obj=new C1();
        obj.add(3,5);
        obj.sub(4,2);

    }
}