import java.util.Scanner;

public class StringOperation { 

    static void print(String str, char ch) {
        if (ch == 'l') {
            System.out.println(str);
        } else {
            System.out.print(str);
        }
    }

    static void printEachCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            print((i + 1) + " character of the string is: " + str.charAt(i), 'l');
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
        print("Length of the string is: " + str.length(), 'l');
        printEachCharacter(str);
    }
}
