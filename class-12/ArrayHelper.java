import java.util.Scanner;

public class ArrayHelper {
    protected Scanner scanner = new Scanner(System.in);

    public void input2DArray(int[][] arr) {
        System.out.println("Enter elements for a " + arr.length + "x" + arr[0].length + " array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public void print2DArray(int[][] arr) {
        for ( int[] row : arr) {
            System.out.print("[");
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println("]");
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}