import java.util.*;

public class SentenceArrange {

    static String sort(String str) {
        String[] words = str.split(" ");
        String rt = "";

        for(int i = 0; i < words.length; i++) {
            for(int j = i; j < words.length; j++) { 
                if(words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        for(int i = 0; i < words.length; i++) {
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
        System.out.println(sentence);
        System.out.println(newSentence + ".");
    }
}
