import java.util.Scanner;

public class ArrayOperation {

    static void inputArray(int[][] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.print("[");
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println("]");
        }
    }

    static void printTranspose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("]");
        }
    }

    static boolean isSymmetric(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        int[][] array1 = new int[size][size];

        System.out.println("Enter the elements of the first array:");
        inputArray(array, scanner);

        System.out.println("Enter the elements of the second array:");
        inputArray(array1, scanner);

        // Array Sum
        int[][] sum = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum[i][j] = array[i][j] + array1[i][j];
            }
        }

        System.out.println("Sum of the two arrays:");
        printArray(sum);

        System.out.println("Transpose of the first array:");
        printTranspose(array);

        System.out.println("Is the first array symmetric? " + (isSymmetric(array) ? "Yes" : "No"));

        scanner.close();
    }
}
