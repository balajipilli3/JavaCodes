interface method{
    default int demo2(int a,int b){
        return a+b;
    }
}

public class interface3 implements method{
    public static void main(String[] args) {
        interface3 obj=new interface3();
        System.out.println(obj.demo2(2,4));

    }
}