import java.util.Scanner;

public class BorderOperation {

    static void inputArray(int[][] arr, Scanner sc) {
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void printMatrix(int[][] arr, String type) {
        System.out.println(type + " elements:");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                boolean cond = switch (type) {
                    case "non-border" -> i > 0 && i < n - 1 && j > 0 && j < n - 1;
                    case "border" -> i == 0 || j == 0 || i == n - 1 || j == n - 1;
                    case "left" -> i == j;
                    case "right" -> i + j == n - 1;
                    case "upper" -> j < n - i;
                    case "lower" -> j >= n - i - 1;
                    default -> false;
                };
                System.out.print(cond ? arr[i][j] + " " : "  ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        inputArray(arr, sc);
        printMatrix(arr, "non-border");
        printMatrix(arr, "border");
        printMatrix(arr, "left");
        printMatrix(arr, "right");
        printMatrix(arr, "upper");
        printMatrix(arr, "lower");
    }
}