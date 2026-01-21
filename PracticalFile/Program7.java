import java.util.*;

public class Program7 {

    static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }x      
      return true;
    }

    static String toPalindrome(String str) {
        char last = str.charAt(str.length() - 1);
        int i = str.length() - 1;

        while (i >= 0 && str.charAt(i) == last) {
            i--;
        }

        String rev = "";
        for (int j = i; j >= 0; j--) {
            rev = rev + str.charAt(j);
        }

        return str + rev;
    }

    static String swap(String str) {
        String[] words = str.split(" ");
        String rt = "";

        for (int i = 0; i < words.length; i++) {
            rt = rt + " " + (!isPalindrome(words[i]) ? toPalindrome(words[i]) : words[i]);
        }

        return rt.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String sentence = sc.nextLine().trim();

        char last = sentence.charAt(sentence.length() - 1);
        if (last != '.' && last != '?' && last != '!') {
            System.out.println("Galat String hai");
            return;
        }

        sentence = sentence.substring(0, sentence.length() - 1);
        String newSentence = swap(sentence);

        System.out.println("OUTPUT:");
        System.out.println(sentence);
        System.out.println(newSentence + ".");
    }
}