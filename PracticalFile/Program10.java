import java.util.Scanner;

public abstract class Program10 {

    static void displayResult(int[] used, int[] sizes, int original, int remaining) {
        for (int i = 0; i < sizes.length; i++) {
            if (used[i] > 0) {
                System.out.println(sizes[i] + " * " + used[i] + " = " + (sizes[i] * used[i]));
            }
        }

        System.out.println("Total number of boxes = " + original);
        int cartonCount = 0;
        for (int x = 0 ; x < used.length; x++) {
            cartonCount += used[x];
        }
        System.out.println("Total number of cartons = " + (remaining > 0 && remaining < 6  ? cartonCount : cartonCount + 1));
        System.out.println("Remaining boxes = " + ((remaining > 0 && remaining < 6) ? remaining + " * 1 = " + remaining : 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of boxes(1-1000): ");
        int n = sc.nextInt();

        if (n < 1 || n > 1000)
            return;

        int original = n;
        int[] sizes = { 48, 24, 12, 6 };
        int[] used = new int[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            n = n % sizes[i];
            used[i] = (n > 0 ? sizes[i] / n : 1);
        }


        displayResult(used, sizes, original, n);
    }
}
