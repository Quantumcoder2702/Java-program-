import java.util.Scanner;

public class SmallerGreaterUsingTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int smaller = (num1 < num2) ? num1 : num2;
        int greater = (num1 > num2) ? num1 : num2;

        System.out.println("Smaller number: " + smaller);
        System.out.println("Greater number: " + greater);

        scanner.close();
    }
}
