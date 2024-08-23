import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many subjects are you taking? ");
        int subjectCount = scanner.nextInt();

        int sumOfMarks = 0;
        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Enter the marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            sumOfMarks += marks;
        }

        double averagePercentage = (double) sumOfMarks / subjectCount;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks Obtained: " + sumOfMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Assigned Grade: " + grade);

        scanner.close();
    }
}
