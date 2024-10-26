import java.util.Scanner;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of z: ");
        int z = scanner.nextInt();

        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        int xAnd = z & y;
        System.out.println("Result of z & y: " + xAnd);

        int xOr = z | y;
        System.out.println("Result of z | y: " + xOr);

        int xXor = z ^ y;
        System.out.println("Result of z ^ y: " + xXor);

        scanner.close();
    }
}
