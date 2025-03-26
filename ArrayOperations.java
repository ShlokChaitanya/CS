import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : array) { sum += num; }
        System.out.println("Sum of all elements: " + sum);

        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) { min = num; }
            if (num > max) { max = num; }
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        System.out.print("Enter the element to search for (linear search): ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                System.out.println("Element found at index (linear search): " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found (linear search).");
        }

        Arrays.sort(array);
        System.out.print("Enter the element to search for (binary search): ");
        target = scanner.nextInt();
        int result = Arrays.binarySearch(array, target);
        System.out.println("Element "+ ((result >= 0)? null : "not" ) +" found at index (binary search): " + result);
        scanner.close();
    }
}
