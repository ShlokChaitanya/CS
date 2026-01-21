import java.util.Scanner;

public class Program11 {
    static char rot13(char c) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < alphabet.length; i++) {
            if (c == alphabet[i]) {
                return alphabet[(i + 13) % alphabet.length];
            }
        }
        return c;
    }

    static String encrypt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result += rot13(text.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text to encrypt using ROT13:");
        String input = sc.nextLine();

        String encrypted = encrypt(input);

        System.out.println("Encrypted Text:");
        System.out.println(encrypted);
    }
}
