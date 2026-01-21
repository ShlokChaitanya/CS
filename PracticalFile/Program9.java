import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of teams (3-8): ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 2 || n >= 9) {
            System.out.println("Jada Team honi Chaiyea");
            return;
        }

        String[] teams = new String[n];
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Team " + (i + 1) + ": ");
            teams[i] = sc.nextLine();
            if (teams[i].length() > maxLen) {
                maxLen = teams[i].length();
            }
        }

        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i < teams[j].length()) ? teams[j].charAt(i) : " ");
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}