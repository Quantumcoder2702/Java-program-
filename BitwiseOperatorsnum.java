public class BitwiseOperatorsnum {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 6;  

        int num3And = num1 & num2;
        System.out.println("num1 & num2 = " + num3And);

        int num3Or = num1 | num2;
        System.out.println("num1 | num2 = " + num3Or);

        int num3Xor = num1 ^ num2;
        System.out.println("num1 ^ num2 = " + num3Xor);

        int num3Not = ~num1; 
        System.out.println("~num1 = " + num3Not);

        System.out.println("Original num1: " + num1);
        System.out.println("Original num2: " + num2);

        System.out.println("Resulting num3 (AND): " + num3And);
        System.out.println("Resulting num3 (OR): " + num3Or);
        System.out.println("Resulting num3 (XOR): " + num3Xor);
        System.out.println("Resulting num3 (NOT): " + num3Not);
}
}
