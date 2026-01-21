import java.util.*;

public class Matrix {
    static int[][] input(int M) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[M][M];
        System.out.println("Enter " + (M * M) + " positive integers:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                int val = sc.nextInt();
                if (val <= 0) {
                    System.out.println("All entries must be positive.");
                    return null;
                }
                A[i][j] = val;
            }
        }
        return A;
    }

    static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printDiagOnly(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i == j || i + j == n - 1) ? a[i][j] : " ");
            }
            System.out.println();
        }
    }

    static int sum(int[][] a) {
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i][i];
            sum += a[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            sum -= a[n / 2][n / 2];
        }
        return sum;
    }

    static void rearrange(int[][] a) {
        int n = a.length;
        int[] interior = new int[n*n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                interior[i * n + j] = a[i][j];
            }
        }

        Arrays.sort(interior);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = interior[i * n + j];
            }
        }
    }

    static void Display(int [][] original, int[][] A, int diagSum) {
        System.out.println("\nOriginal Matrix:");
        printMatrix(original);
        System.out.println("\nRearranged Matrix (interior sorted ascending):");
        printMatrix(A);
        System.out.println("\nOnly Diagonal Elements of Rearranged Matrix:");
        printDiagOnly(A);
        System.out.println("\nSum of both diagonals = " + diagSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order M (4..9): ");
        int M = sc.nextInt();
        if (M <= 3 || M >= 10) {
            System.out.println("Invalid M. Must be greater than 3 and less than 10.");
            return;
        }

        int[][] A = input(M);
        int[][] original = A;
        int diagSum = sum(A);

        rearrange(A);
        Display(original, A, diagSum);
    }
}
