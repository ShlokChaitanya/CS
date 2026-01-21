import java.util.*;

public class Program3 {
    static String factors = "";

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int mobius(int n) {
        String f = "";
        if (n == 1) return 1;
        int num = n, count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i) && n % i == 0) {
                int power = 0;
                while (n % i == 0) {
                    n /= i;
                    power++;
                }
                if (power > 1)
                    return 0;
                f += i + " x ";
                count++;
            }
        }

        factors = f.trim();
        return (count % 2 == 0) ? 1 : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("INVALID INPUT");
            return;
        }
        int result = mobius(N);
        System.out.print("OUTPUT: ");
        System.out.print(N + " = ");
        if (N == 1) {
            System.out.println("1");
            System.out.println("NUMBER OF DISTINCT PRIME FACTORS = 0");
            System.out.println("M (" + N + ") = " + result);
            return;
        }
        System.out.println(factors.substring(0, factors.length() - 2));
        System.out.println("NUMBER OF DISTINCT PRIME FACTORS = " + factors.split("x").length);
        System.out.println("M (" + N + ") = " + result);
    }
}