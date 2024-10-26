import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        final double HRA_LESS_THAN_12000 = 0.20; // 20%
        final double DA_LESS_THAN_12000 = 1.15;  // 115%
        final double HRA_GREATER_THAN_12000 = 0.15; // 15%
        final double DA_GREATER_THAN_12000 = 0.90;  // 90%

        double hra, da;

        if (basicSalary < 12000) {
            hra = basicSalary * HRA_LESS_THAN_12000;
            da = basicSalary * DA_LESS_THAN_12000;
        } else {
            hra = basicSalary * HRA_GREATER_THAN_12000;
            da = basicSalary * DA_GREATER_THAN_12000;
        }

        double grossSalary = basicSalary + hra + da;

        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }
}