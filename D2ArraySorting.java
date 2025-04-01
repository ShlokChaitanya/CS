import java.util.*;

public class D2ArraySorting {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("The original array is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
           System.out.print("\n");
        }
        System.out.print("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
        sc.close();
    }
} 