
public class MultiplyToSingleDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int singleDigit = multiplyToSingleDigit(num);
        System.out.println("Single digit result: " + singleDigit);

        scanner.close();
    }

    public static int multiplyToSingleDigit(int num) {
        while (num >= 10) {
            num = multiplyDigits(num);
        }
        return num;
    }

    public static int multiplyDigits(int num) {
        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                product *= digit;
            }
            num /= 10;
        }
        return product;
    }
}21:07 21-08-202421:07 21-08-2024