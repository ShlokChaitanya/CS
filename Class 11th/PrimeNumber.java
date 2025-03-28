public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
    
        System.out.println(number + " is a prime number: " + isPrime(number));
        scanner.close();
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
    
        return true;
    }   
}