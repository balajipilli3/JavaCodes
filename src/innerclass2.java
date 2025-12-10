package Inner_Class;


class Outer {
    private int age = 24;

    public class Inner {
        int getValue() {
            return age;
        }
    }
}
public class innerclass2 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner obj2 = obj.new Inner();
        System.out.println(obj2.getValue());
    }
}