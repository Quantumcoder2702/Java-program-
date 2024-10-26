public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println("Even Palindrome Numbers:");
        printPalindromeNumbers(true);

        System.out.println("\nOdd Palindrome Numbers:");
        printPalindromeNumbers(false);
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void printPalindromeNumbers(boolean even) {
        int start = even ? 100 : 101;
        int end = 1000;

        for (int i = start; i <= end; i += 2) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
