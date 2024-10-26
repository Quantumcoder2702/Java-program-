public class SeriesSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N for series a: ");
        int N = scanner.nextInt();
        double sumA = 0.0;
        for (int i = 1; i <= N; i++) {
            sumA += 1.0 / i;
        }
        System.out.println("Sum of series a: " + sumA);

        System.out.print("Enter the value of x for series b: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the value of n for series b: ");
        int n = scanner.nextInt();
        double sumB = 0.0;
        for (int i = 0; i <= n; i++) {
            sumB += 1.0 / Math.pow(x, i);
        }
        System.out.println("Sum of series b: " + sumB);

        System.out.print("Enter the value of n for series c: ");
        int nC = scanner.nextInt();
        double sumC = 0.0;
        for (int i = 0; i <= nC; i++) {
            sumC += 1.0 / factorial(i);
        }
        System.out.println("Sum of series c: " + sumC);

        System.out.print("Enter the value of n for series d: ");
        int nD = scanner.nextInt();
        int sumD = 0;
        for (int i = 1; i <= nD; i++) {
            if (i % 2 == 0) {
                sumD += Math.pow(i, 3);
            } else {
                sumD += Math.pow(i, 2);
            }
        }
        System.out.println("Sum of series d: " + sumD);

        scanner.close();
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}