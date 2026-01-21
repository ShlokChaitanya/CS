import java.util.*;

public class Program4 {
    static int reverse(int x) {
        int r = 0;
        while (x > 0) {
            r = r * 10 + (x % 10);
            x /= 10;
        }
        return r;
    }

    static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    static boolean isAdam(int x) {
        int sq = x * x;
        int revN = reverse(x);
        int sqRev = revN * revN;
        return reverse(sq) == sqRev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        if (m < 0 || n < 0 || m >= n) {
            System.out.println("INVALID INPUT");
            return;
        }
        int count = 0;
        String sb = "";
        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isAdam(i)) {
                if (count > 0)
                    sb += " ";
                sb += i;
                count++;
            }
        }
        System.out.println("THE PRIME-ADAM INTEGERS ARE: " + (count == 0 ? "NIL" : sb));
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
    }
}
