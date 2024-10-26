public class AOD 
{

    public static void main(String[] args) 
{
 int a = 10;
 int b = 5;
 int c = 15;
 int d = 20;
 int e = 4;
 int f = 16;
 int g = 10;

System.out.println("Initial value of a: " + a );
a++;
System.out.println("Initial value of b: " + b );
b--;
System.out.println("Initial value of c : " + c );
c += 5;
System.out.println("Initial value of d: " + d );
d -=3;
System.out.println("Initial value of e: " + e );
e *= 3;
System.out.println("Initial value of f: " + f );
f /= 4;
System.out.println("Initial value of g: " + g );
g %= 3;

System.out.println("After increment ( a++ ): " + a );
System.out.println("After decrement ( b-- ): " + b );
System.out.println("After addition assignment ( c += 5 ): " + c );
System.out.println("After subtraction assignment ( d -= 3 ): " + d );
System.out.println("After multiplication assignment ( e *= 3 ): " + e );
System.out.println("After division assignment (f /= 4): " + f );
System.out.println(" modulus assignment (g %= 3): " + g );
}
}


