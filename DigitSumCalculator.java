import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number; // Store the original number for display later

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits in " + originalNumber + ": " + sum);

        scanner.close();
    }
}
