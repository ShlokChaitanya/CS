public class FunctionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a, b);
        String d = add("Hello", "World");
        // System.out.println("Sum of " + a + " and " + b + " is " + c);
        System.out.println(d);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

}