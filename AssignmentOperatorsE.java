public class AssignmentOperatorsE 
{
    public static void main(String[] args) 
{
        int number = 10;

        // Increment operator
        number++;  // Equivalent to number = number + 1
        System.out.println("After increment: " + number); // Output: 11

        // Decrement operator
        number--;  // Equivalent to number = number - 1
        System.out.println("After decrement: " + number); // Output: 10

        // Addition assignment operator
        number += 5;  // Equivalent to number = number + 5
        System.out.println("After addition assignment: " + number); // Output: 15

        // Subtraction assignment operator
        number -= 3;  // Equivalent to number = number - 3
        System.out.println("After subtraction assignment: " + number); // Output: 12

        // Multiplication assignment operator
        number *= 2;  // Equivalent to number = number * 2
        System.out.println("After multiplication assignment: " + number); // Output: 24

        // Division assignment operator
        number /= 4;  // Equivalent to number = number / 4
        System.out.println("After division assignment: " + number); // Output: 6

        // Modulo assignment operator
        number %= 5;  // Equivalent to number = number % 5
        System.out.println("After modulo assignment: " + number); // Output: 1
}
}