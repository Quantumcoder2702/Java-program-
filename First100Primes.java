public class First100Primes {
    public static void main(String[] args) {
        System.out.println("First 100 prime numbers:");

        int count = 0;
        int num = 2;

        while (count < 100) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
