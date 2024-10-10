import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting student details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();

        // Initializing variables for marks
        double[] marks = new double[3];
        double totalMarks = 0;

        // Input marks for three subjects
        for (int i = 0; i < marks.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter marks for subject " + (i + 1) + ": ");
                    marks[i] = Double.parseDouble(scanner.nextLine());

                    // Validate marks are in range 0 to 100
                    if (marks[i] < 0 || marks[i] > 100) {
                        throw new NumberFormatException();
                    }

                    totalMarks += marks[i]; // Accumulate total marks
                    break; // Exit the loop if input is valid
                } catch (NumberFormatException e) {
                    // Handle invalid number input
                    System.out.println("Invalid input! Please enter a number between 0 and 100.");
                }
            }
        }

        // Calculate percentage
        double percentage = (totalMarks / 300) * 100;
        String grade = calculateGrade(percentage);

        // Display results
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Method to calculate grade based on percentage
    private static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
