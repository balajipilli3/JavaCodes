class dog2{
    String color;
    String breed;
    dog2(String color,String breed){
        this.color=color;
        this.breed=breed;
    }
    public void ddetails(){
        System.out.println(color+" "+breed);
    }
}
class bdog extends dog2 {
    String name;
    bdog(String name,String color,String breed){
        super(color,breed);
        this.name=name;

    }

    public void bdetails() {
        System.out.println(name+" "+color+" "+breed);
    }
}

public class single2 {
    static void main(String[] args) {
        bdog obj=new bdog("leo","blak brown","Rotweeler");
        obj.bdetails();
    }
}