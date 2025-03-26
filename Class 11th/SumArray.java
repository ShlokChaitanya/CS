import java.util.*;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];

        System.out.println("Enter the elements of the 3x3 array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int element = array[i][j];
                if (element % 2 == 0) {
                    evenSum += element;
                } else {
                    oddSum += element;
                }
            }
        }

        System.out.println("Sum of all elements: " + (evenSum + oddSum));
        System.out.println("Sum of all even elements: " + evenSum);
        System.out.println("Sum of all odd elements: " + oddSum);
        scanner.close();
    }
}