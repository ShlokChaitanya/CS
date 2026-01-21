import java.util.Scanner;

public class Program14 {
    static int vowelCount = 0;

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    static String sort(String str) {
        String[] words = str.split(" ");
        String rt = "";

        for (int i = 0; i < words.length; i++) {
            boolean cd1 = isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1));
            if (cd1) {
                vowelCount++;
            } else {
                for (int j = i; j < words.length; j++) {
                    boolean cd2 = isVowel(words[j].charAt(0)) && isVowel(words[j].charAt(words[j].length() - 1));
                    if (cd2) {
                        vowelCount++;
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            rt = rt + " " + words[i];
        }

        return rt.trim().substring(0, 1).toUpperCase() + rt.trim().substring(1, rt.trim().length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT:");
        String sentence = sc.nextLine().trim();

        char last = sentence.charAt(sentence.length() - 1);
        if (last != '.' && last != '?' && last != '!') {
            System.out.println("Galat String hai");
            return;
        }

        sentence = sentence.substring(0, sentence.length() - 1).toLowerCase();
        String newSentence = sort(sentence);

        System.out.println("OUTPUT:");
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL: " + vowelCount);
        System.out.println("ORIGINAL: " + sentence);
        System.out.println("SORTED: " + newSentence + ".");
    }
}
