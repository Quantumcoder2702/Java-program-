public class DecrementExample {
    public static void main(String[] args) {
        int num = 10;

        // Post-decrement: Decrease num after using its current value
        int postDecrementResult = num--;
        System.out.println("Post-decrement result: " + postDecrementResult); // Prints 10
        System.out.println("Updated num (after post-decrement): " + num); // Prints 9

        // Pre-decrement: Decrease num before using its current value
        int preDecrementResult = --num;
        System.out.println("Pre-decrement result: " + preDecrementResult); // Prints 8
        System.out.println("Updated num (after pre-decrement): " + num); // Prints 8
    }
}
