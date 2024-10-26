public class ASC{
  public static void main (String [] args){
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter basic montly salary:");
  double basicSalary = scanner.nextDouble();

  System.out.print("Enter the dearness allowance (DA)as a percentage of basic salary");
  double daPercentage = scanner.nextDouble();

  System.out.print("Enter the house rent allowance (HRA)as a percentage of basic salary:");
  double hraPercentage = scanner.nextDouble();
   
  System.out.print("Enter the provident fund (PF) contribution per month:");
  double pfcontribution = scanner.nextDouble();
  double annualBasic = basicSalary * 12;
  double annualDA = (daPercentage / 100 ) * annualBasic;
  double annualHRA = (hraPercentage / 100 ) * annualBasic;
  double annualPF = pfcontribution * 12;
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
