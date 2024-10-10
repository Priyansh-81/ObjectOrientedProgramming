import java.util.Scanner;

class Student {
    private String registrationNumber;
    private String firstName;
    private String lastName;
    private String degree;

    // Constructor
    public Student(String registrationNumber, String firstName, String lastName, String degree) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    // Getters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDegree() {
        return degree;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Degree: " + degree);
        System.out.println("--------------------------------");
    }
}

public class StudentSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array of 10 Student objects
        Student[] students = new Student[10];

        // Accepting data for each student from user input
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Registration Number: ");
            String registrationNumber = scanner.nextLine();
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Degree: ");
            String degree = scanner.nextLine();

            // Creating a new Student object with user input and adding it to the array
            students[i] = new Student(registrationNumber, firstName, lastName, degree);
            System.out.println(); // Adding a line break for better readability
        }

        // User input for search
        System.out.print("Enter the first name or last name of the student to search: ");
        String searchName = scanner.nextLine().trim();

        boolean found = false;

        // Searching for the student by first name or last name
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(searchName) || 
                student.getLastName().equalsIgnoreCase(searchName)) {
                student.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student found with the name: " + searchName);
        }

        scanner.close();
    }
} 