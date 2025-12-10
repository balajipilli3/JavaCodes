abstract class demo32
{
    abstract void add(int a,int b);
}


public class anonymous1 {
    public void add(int a,int b)
    {

    }
    public static void main(String[] args) {
        anonymous1 obj=new anonymous1(){
            public void add(int a,int b){
                System.out.println(a+b);
            }
        };
        obj.add(20,10);
    }
}
