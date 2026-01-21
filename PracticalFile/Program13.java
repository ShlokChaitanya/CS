import java.util.Scanner;

public class Program13 {

    static int option(char score) {
        if (score == 'A') return 1;
        else if (score == 'B') return 2;
        else if (score == 'C') return 3;
        else if (score == 'D') return 4;
        else return 0;
    }

    static int[][] input(int n) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[n][5];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the options of Participant " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print("Option of Q" + (j + 1) + ": ");
                matrix[i][j] = option(scanner.nextLine().trim().charAt(0));
            }
        }

        return matrix;
    }

    static void printScores(int[][] matrix, int[] key, int n) {
        System.out.println("Scores of Participants: ");
        for (int i = 0; i < n; i++) {
            int score = 0;
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == key[j]) {
                    score++;
                }
            }
            System.out.println("Participant " + (i + 1) + ": " + score);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Participants(3 - 11): ");
        int n = scanner.nextInt();
        if (n < 3 || n > 11) {
            System.out.println("Participants ke number galat hai");
            return;
        }

        int[][] matrix = input(n);

        System.out.println("Enter Key for Questions: ");
        int[] key = new int[5];
        for (int j = 0; j < 5; j++) {
            System.out.print("Key for Q" + (j + 1) + ": ");
            key[j] = option(scanner.next().trim().charAt(0));
        }

        printScores(matrix, key, n);
    }
}
