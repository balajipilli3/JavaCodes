class addition{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
public class userdefined2 {
    public static void main(String[] args) {
        addition a=new addition();
        int r1=a.add(5,1);
        System.out.println(r1);
        int r=a.sub(5,1);
        System.out.println(r);

    }
}