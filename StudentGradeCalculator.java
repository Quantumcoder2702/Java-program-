import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter marks in five subjects:");
        double[] marks = new double[5];
        double totalMarks = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        double percentage = (totalMarks / 500) * 100;

        char grade;
        if (percentage >= 90) {
            grade = 'O';
        } else if (percentage >= 80) {
            grade = 'E';
        } else if (percentage >= 70) {
            grade = 'A';
        } else if (percentage >= 60) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}