interface A13 {
    void displayA13();
}

interface B13 extends A13 {
    void displayB13();
}

interface C13 extends A13 {
    void displayC13();
}

class DemoB13 implements B13 {
    public void displayA13() {
        System.out.println("balaji");
    }
    public void displayB13() {
        System.out.println("pilli");
    }
}

class DemoC13 implements C13 {
    public void displayA13() {
        System.out.println("b06");
    }
    public void displayC13() {
        System.out.println("b09");
    }
}

public class interface6 {
    public static void main(String[] args) {

        DemoB13 obj1 = new DemoB13();
        DemoC13 obj2 = new DemoC13();

        System.out.println("---- Using DemoB ----");
        obj1.displayA13();
        obj1.displayB13();

        System.out.println("---- Using DemoC ----");
        obj2.displayA13();
        obj2.displayC13();
    }
}
