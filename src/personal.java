class student{
    String name="Baalji Pilli";
    int age=25;
    String address="Gangavathi";
}
public class personal {
    public static void main(String[] args) {
        student s=new student();
        System.out.println(" Name:"+s.name+"\n age:"+s.age+"\n address:"+s.address);
    }
}