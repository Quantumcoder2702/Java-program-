import java.util.Scanner;

public class LargestSmallestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();

            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        scanner.close();
    }
}
