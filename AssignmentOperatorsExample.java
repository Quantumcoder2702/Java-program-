public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Using assignment operators
        x += y; // Equivalent to x = x + y
        System.out.println("x after addition: " + x); // Prints 15

        x -= y; // Equivalent to x = x - y
        System.out.println("x after subtraction: " + x); // Prints 10

        x *= y; // Equivalent to x = x * y
        System.out.println("x after multiplication: " + x); // Prints 50

        x /= y; // Equivalent to x = x / y
        System.out.println("x after division: " + x); // Prints 10

        x %= y; // Equivalent to x = x % y
        System.out.println("x after modulus: " + x); // Prints 0
    }
}
