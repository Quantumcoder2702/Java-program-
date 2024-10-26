// int a = 10;
// int b = 5;
// int result = a - b;
// System.out.println("Result of a - b: " + result);

public class OperatorDifference {

    public static void differentiateOperators(int a, int b) {
        // Unary Minus
        int unaryMinusA = -a;

        // Binary Minus
        int binaryMinusResult = a - b;

        // Bitwise NOT
        int bitwiseNotA = ~a;

        System.out.println("Unary Minus (-a): " + unaryMinusA);
        System.out.println("Binary Minus (a - b): " + binaryMinusResult);
        System.out.println("Bitwise NOT (~a): " + bitwiseNotA);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        differentiateOperators(a, b);
    }
}