class personalDetails{
    String name1;int age1 ;int rollno1;String branch1;
    personalDetails(String name, int age,int rollno,String branch){
        name1=name;
        age1=age;
        rollno1=rollno;
        branch1=branch;
    }
    public void details(){
        System.out.println(name1+"\n"+age1+"\n"+rollno1+"\n"+branch1);

    }
}
public class method5 {
    public static void main(String[] args) {
        personalDetails p=new personalDetails("Balaji pili",24,20765,"Computer Applications");
        p.details();
    }
}
