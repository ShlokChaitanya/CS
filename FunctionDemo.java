public class FunctionDemo {
    static int count = 0;
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a, b);
        String d = add("Hello", "World");
        System.out.println(d);
        System.out.println(c);
        pattern();
        pattern();
        // System.out.println("Sum of " + a + " and " + b + " is " + c);
    }

    public static void pattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void counterKar() {
        count++;
        System.out.println(count);
    }

    public static int add(int a, int b) {
        counterKar();
        return a + b;
    }

    public static String add(String a, String b) {
        counterKar();
        return a + b;
    }
}