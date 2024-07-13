import java.util.*;

public class OneDArraySum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();
         
        float[] array1 = new float[size];
        float[] array2 = new float[size];
        float[] array3 = new float[size];
        
        System.out.println("Enter values for the first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            array1[i] = scanner.nextFloat();
        }
        
        System.out.println("Enter values for the second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            array2[i] = scanner.nextFloat();
        }
        
        for (int i = 0; i < size; i++) {
            array3[i] = array1[i] + array2[i];
        }
        
        for (int i = 0; i < size; i++) {
            System.out.println("Sum of the array "+ i + ":" + array3[i]);
        }
        scanner.close();
    }
}
