import java.util.Scanner;

public class AnnualSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic monthly salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter the dearness allowance (DA) as a percentage of basic salary: ");
        double daPercentage = scanner.nextDouble();

        System.out.print("Enter the house rent allowance (HRA) as a percentage of basic salary: ");
        double hraPercentage = scanner.nextDouble();

        System.out.print("Enter the provident fund (PF) contribution per month: ");
        double pfContribution = scanner.nextDouble();

        double annualBasic = basicSalary * 12;
        double annualDA = (daPercentage / 100) * annualBasic;
        double annualHRA = (hraPercentage / 100) * annualBasic;
        double annualPF = pfContribution * 12;
        double annualSalary = annualBasic + annualDA + annualHRA - annualPF;

        System.out.println("\nAnnual Salary Calculation:");
        System.out.println("Annual Basic Salary: $" + annualBasic);
        System.out.println("Annual DA: $" + annualDA);
        System.out.println("Annual HRA: $" + annualHRA);
        System.out.println("Annual PF Contribution: $" + annualPF);
        System.out.println("Total Annual Salary: $" + annualSalary);

        scanner.close();
    }
}
