import java.util.*;

public class Program6 {

    static boolean isValidTerminator(char ch) {
        return ch == '.' || ch == '?' || ch == '!';
    }

    static int compareWords(String a, String b) {
        if (a.length() == b.length())
            return a.compareTo(b);
        return a.length() - b.length();
    }

    static String sortWords(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length() || (words[i].length() == words[j].length() && words[i].compareTo(words[j]) > 0)) {

                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        String rt = "";
        for (int i = 0; i < words.length; i++) {
            rt = rt + words[i] + (i < words.length - 1 ? " " : "");
        }

        return rt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine().trim();

        if (sentence.length() == 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        char last = sentence.charAt(sentence.length() - 1);
        if (!isValidTerminator(last)) {
            System.out.println("INVALID TERMINATING CHARACTER");
            return;
        }

        sentence = sentence.substring(0, sentence.length() - 1).trim();
        String newSentence = sortWords(sentence);

        System.out.println("OUTPUT:");
        System.out.println(sentence + last);
        System.out.println(newSentence + last);
    }
}
