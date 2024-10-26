import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        
        scanner.close();
        
        printFibonacciSeries(n);
    }
    
    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("The number of terms must be a positive integer.");
            return;
        }
        
        int a = 0, b = 1;
        
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
