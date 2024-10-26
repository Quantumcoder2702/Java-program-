public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        int resultMinus = a - b;
        System.out.println("a - b = " + resultMinus);

        int resultTilde = ~a;
        System.out.println("~a = " + resultTilde);

        System.out.println("Binary representation of a: " + Integer.toBinaryString(a);
        System.out.println("Binary representation of ~a: " + Integer.toBinaryString(resultTilde));

        System.out.println("Inverted bits of a: " + Integer.toBinaryString(~a));
    }
}
