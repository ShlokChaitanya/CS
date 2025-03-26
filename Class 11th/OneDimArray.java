import java.util.Scanner;

public class OneDimArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dataTypes = { "Integer", "Double", "Char", "String" };

        System.out.println("Select the type of array to create:");
        for (int i = 0; i < dataTypes.length; i++) {
            System.out.println((i + 1) + ". " + dataTypes[i]);
        }

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                handleArray(scanner, new Integer[10]);
                break;
            case 2:
                handleArray(scanner, new Double[10]);
                break;
            case 3:
                handleArray(scanner, new Character[10]);
                break;
            case 4:
                handleArray(scanner, new String[10]);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void handleArray(Scanner scanner, Integer[] array) {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        printArray(array);
    }

    public static void handleArray(Scanner scanner, Double[] array) {
        System.out.println("Enter 10 doubles:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        printArray(array);
    }

    public static void handleArray(Scanner scanner, Character[] array) {
        System.out.println("Enter 10 characters:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next().charAt(0);
        }
        printArray(array);
    }

    public static void handleArray(Scanner scanner, String[] array) {
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        printArray(array);
    }

    public static <T> void printArray(T[] array) {
        System.out.println("The elements you entered are:");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}