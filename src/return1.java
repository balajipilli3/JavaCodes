public class return1 {

    // Main method must be public and have String[] args
    public static void main(String[] args) {
        return1 obj = new return1();
        int result = obj.add(10, 20);
        System.out.println("Sum = " + result);
    }

    // Method to add two numbers
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
