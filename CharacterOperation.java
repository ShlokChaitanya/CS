import java.util.*;

public class CharacterOperation {

    static void print(String str, char ch) {
        if (ch == 'l') {
            System.out.println(str);
        } else  {
            System.out.print(str);
        }
    }

    static String stringInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static void main(String[] args) {
        String str = stringInput();

        print("Entered  String is: " + str, 'l');
        print("Entered string is a Digit: " + Character.isDigit(str.charAt(0)), 'l');
        print("Entered string is a Letter: " + Character.isLetter(str.charAt(0)), 'l');
        print("Entered string is a Lowercase: " + Character.isLowerCase(str.charAt(0)), 'l');
        print("Entered string is a Uppercase: " + Character.isUpperCase(str.charAt(0)), 'l');
        print("Entered string to a Lowercase: " + str.toLowerCase(), 'l');
        print("Entered string to a Uppercase: " + str.toUpperCase(), 'l');
        
    }
}