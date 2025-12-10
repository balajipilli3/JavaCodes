package Constructors;
class Vehical {
    String vehicleName;
    String regNo;
    double price;
    String color;

    Vehical(String vName, String rNo, double p, String c) {
        vehicleName = vName;
        regNo = rNo;
        price = p;
        color = c;
    }
    public void Vdetails() {
        System.out.println("Vehicle Color: " + color);
    }
}

public class vehicle {
    public static void main(String[] args) {
        Vehical v1 = new Vehical("Honda City", "KA01AB0000", 1200000, "White");
        v1.Vdetails();
    }
}