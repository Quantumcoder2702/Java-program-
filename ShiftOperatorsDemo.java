import java.util.Scanner;

public class ShiftOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the original number (v): ");
            int v = scanner.nextInt();
            System.out.print("Enter the shifting value (n): ");
            int n = scanner.nextInt();

            int leftShiftResult = v << n;
            System.out.println("Left shift result: " + leftShiftResult);

            int rightShiftResult = v >> n;
            System.out.println("Right shift result: " + rightShiftResult);

            int unsignedRightShiftResult = v >>> n;
            System.out.println("Unsigned right shift result: " + unsignedRightShiftResult);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}


