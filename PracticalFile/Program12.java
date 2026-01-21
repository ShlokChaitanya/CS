import java.util.Scanner;

public class Program12 {
    
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int rotateNumber(String numStr) {
        String rotatedStr = numStr.substring(1) + numStr.charAt(0);
        return Integer.parseInt(rotatedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's Circular Prime:");
        String input = scanner.nextLine().trim();

        for (int i = 0; i < input.length(); i++) {
            int currentNumber = Integer.parseInt(input);
            System.out.println(currentNumber);
            if (!isPrime(currentNumber)) {
                System.out.println(input + " is not a Circular Prime.");
                return;
            }
            input = String.valueOf(rotateNumber(input));
        }

        System.out.println(input + " is a Circular Prime.");
    }
}
