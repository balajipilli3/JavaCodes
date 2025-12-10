class vehicle2{
    String color;
    vehicle2(String color){
        this.color=color;
    }
    public void vehicleDetails(){
        System.out.println(color);
    }
}

class car1 extends vehicle2{
    String regNo;
    long price;
    car1(String regNo,long price,String color){
        super(color);
        this.regNo=regNo;
        this.price=price;
    }
    public void carDetails(){
        System.out.println(color+" "+regNo+" "+price);
    }
}
class bike1 extends car1{
    String name;
    bike1(String name,String regNo,long price,String color){
        super(regNo,price,color);
        this.name=name;
    }
    public void bikeDetails(){
        System.out.println(name+" "+color+" "+regNo+" "+price);
    }
}

public class multilevel2 {
    public static void main(String[] args) {
        bike1 obj=new bike1("bmw 450F GS","KA37BP1899 ",450000,"black");
        obj.vehicleDetails();
        obj.carDetails();
        obj.bikeDetails();
    }
}
































