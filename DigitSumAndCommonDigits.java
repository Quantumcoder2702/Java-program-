import java.util.Scanner;

public class DigitSumAndCommonDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        int commonDigitCount = 0;
        int tempSum = sum;

        while (tempSum > 0) {
            int digit = tempSum % 10;
            if (originalNumber % 10 == digit) {
                commonDigitCount++;
            }
            tempSum /= 10;
        }

        System.out.println("Sum of digits in " + originalNumber + ": " + sum);
        System.out.println("Common digits with original number: " + commonDigitCount);

        scanner.close();
    }
}