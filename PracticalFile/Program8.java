import java.util.Scanner;

public class Program8 {
    
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an even integer(10 - 48): ");
        int N = sc.nextInt();

        if (N <= 9 || N >= 50 || N % 2 != 0) {
            System.out.println("Padh likh tho leta");
            return;
        }

        int count = 0;
        System.out.println("Goldbach pairs for " + N + ":");
        for (int p = 3; p <= N / 2; p += 2) {
            int q = N - p;
            if (isPrime(p) && isPrime(q)) {
                System.out.println(N + " = " + p + " + " + q);
                count++;
            }
        }
        System.out.println("Total odd prime pairs: " + count);
    }
}
