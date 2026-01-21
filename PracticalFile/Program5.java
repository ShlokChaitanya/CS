import java.util.Scanner;

public class Program5 {
     static int Input(Scanner sc, String prompt, int lowInclusive, int highInclusive) {
        System.out.print(prompt);
        int v = sc.nextInt();
        if (v < lowInclusive || v > highInclusive) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        return v;
    }

    static int[][] readMatrix(Scanner sc, int m, int n) {
        int[][] a = new int[m][n];
        System.out.println("Enter matrix values (digits 0-7) row by row:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                if (val < 0 || val > 7) {
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
                a[i][j] = val;
            }
        }
        return a;
    }

    static void printMatrix(int[][] a) {
        System.out.println("Original matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                if (j < a[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int octalRowToDecimal(int[] row) {
        int dec = 0;
        int n = row.length;
        for (int j = 0; j < n; j++) {
            dec = dec * 8 + row[j];
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = Input(sc, "Enter number of rows M (1-9): ", 1, 9);
        int n = Input(sc, "Enter number of columns N (3-5): ", 3, 5);

        int[][] matrix = readMatrix(sc, m, n);

        printMatrix(matrix);

        System.out.println();
        System.out.println("Decimal equivalents (row wise):");
        for (int i = 0; i < m; i++) {
            int dec = octalRowToDecimal(matrix[i]);
            System.out.print("Row " + (i + 1) + " (octal): ");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println("  = " + dec + "(decimal)");
        }
    }
}
