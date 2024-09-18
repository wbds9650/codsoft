import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects;
        int totalMarks = 0;
        double average;
        char grade;

        System.out.println("Enter the number of subjects:");
        numberOfSubjects = scanner.nextInt();
        int[] marks = new int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        average = (double) totalMarks / numberOfSubjects;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
