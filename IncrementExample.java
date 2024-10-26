public class IncrementExample {
    public static void main(String[] args) {
        int num = 5;

        // Post-increment: Increase num after using its current value
        int postIncrementResult = num++;
        System.out.println("Post-increment result: " + postIncrementResult); // Prints 5
        System.out.println("Updated num (after post-increment): " + num); // Prints 6

        // Pre-increment: Increase num before using its current value
        int preIncrementResult = ++num;
        System.out.println("Pre-increment result: " + preIncrementResult); // Prints 7
        System.out.println("Updated num (after pre-increment): " + num); // Prints 7
    }
}
