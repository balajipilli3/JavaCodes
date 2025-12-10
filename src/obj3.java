import java.sql.SQLOutput;

class dog1{

    String name="leo";
    int age=4;
    String colour="black";
}
class cat{

    String name="reo";
    int age=3;
    String colour="white";
}


public class obj3{
    public static void main(String[] args){
        dog1 a=new dog1();
        System.out.println("name is :"+a.name+" "+"age is :"+a.age+" "+"colour is :"+a.colour);
        cat b=new cat();
        System.out.println("name is :"+b.name+" "+"age is :"+b.age+" "+"colour is :"+b.colour);

    }



}
