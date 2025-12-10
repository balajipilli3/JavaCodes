interface A12{
    void displayA12();
}

interface B12 extends A12 {
    void displayB12();
}



class Demo12 implements B12 {

    public void displayA12() {
        System.out.println("This is displayA() from Interface A");
    }

    public void displayB12() {
        System.out.println("This is displayB() from Interface B");
    }


}

public class interface5 {
    public static void main(String[] args) {

        Demo12 obj = new Demo12();

        obj.displayA12();
        obj.displayB12();

    }
}
