public class FourDigitNumbers {

    public static void main(String[] args) {
        for (int num = 1000; num <= 9999; num++) {
            int firstTwoDigits = num / 100;
            int lastTwoDigits = num % 100;
            int sum = firstTwoDigits + lastTwoDigits;
            if (sum * sum == num) {
                System.out.println(num);
            }
        }
    }
}