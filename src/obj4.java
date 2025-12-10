

class car{

    String name="Range rover velar 250S";
    long price=25000000l;
    String colour ="Black";
    int model=2023;
    String regno="KA 37 ML 1899";
}
class  bike{

    String name="BMW GS 310";
    long price=400000l;
    String colour ="white";
    int model=2023;
    String regno="KA 37 ML 1899";
}

public class obj4 {
    public static void main(String[] args) {
        car a = new car();
        System.out.println("name is :" + a.name + " " + "Price is :" + a.price + " " + "coluor is :" + a.colour + " " + "model is :" + a.model+" " + "reg no is :" + a.regno);

        bike b = new bike();
        System.out.println("name is :" + b.name + " " + "Price is :" + b.price + " " + "coluor is :" + b.colour + " " + "model is :" + b.model+" " + "reg no is :" + b.regno);

    }



}


