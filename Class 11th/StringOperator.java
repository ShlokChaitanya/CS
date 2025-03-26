import java.util.Scanner;

public class StringOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LastChar(input);
        System.out.println("Indexes of vowels in the string: " + index(input));
        System.out.println("String after swapping case: " + swapCase(input));
        System.out.println("String after swapping case of last character: " + swapLastCase(input));
        
        sc.close();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private static void LastChar(String input) {
        if (input.length() >= 2) {
            char secondLastChar = input.charAt(input.length() - 2);
            System.out.println("Second last character: " + secondLastChar);
        } else {
            System.out.println("The string is too short to have a second last character.");
        }
    }

    private static String index(String input) {
        StringBuilder index = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                index.append(i).append(", ");
            }
        }
        return index.toString();
    }

    private static String swapCase(String input) {
        StringBuilder swappedCase = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            swappedCase.append((i % 2 == 0) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
        }
        return swappedCase.toString();
    }

    private static String swapLastCase(String input) {
        StringBuilder swappedCase = new StringBuilder(input);
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        swappedCase.setCharAt(0, lastChar);
        swappedCase.setCharAt(input.length() - 1, firstChar);
        return swappedCase.toString();
    }
}
