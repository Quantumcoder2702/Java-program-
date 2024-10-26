public class AssignmentOperatorsDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        // Using increment operator
        System.out.println("Initial value of a: " + a );
        a++;
        System.out.println("After increment ( a++ ): " + a );

        // Using decrement operator
        System.out.println("Initial value of b: " + b );
        b--;
        System.out.println("After decrement ( b-- ): " + b );

        // Using addition assignment operator
        int c = 15;
        System.out.println("Initial value of c : " + c );
        c += 5;
        System.out.println("After addition assignment ( c += 5 ): " + c );

        // Using subtraction assignment operator
        int d = 20;
        System.out.println("Initial value of d: " + d );
        d -= 3;
        System.out.println("After subtraction assignment ( d -= 3 ): " + d );

        // Using multiplication assignment operator
        int e = 4;
        System.out.println("Initial value of e: " + e );
        e *= 3; 
        System.out.println("After multiplication assignment ( e *= 3 ): " + e );

        // Using division assignment operator
        int f = 16;
        System.out.println("Initial value of f: " + f );
        f /= 4;
        System.out.println("After division assignment (f /= 4): " + f );

        // Using modulus assignment operator
        int g = 10;
        System.out.println("Initial value of g: " + g );
        g %= 3;
        System.out.println("After modulus assignment (g %= 3): " + g );
    }
}