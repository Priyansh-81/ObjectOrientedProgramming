import java.util.Scanner;

class Student {

    String registrationNumber;
    String firstName;
    String lastName;
    String degree;

    public Student(
        String registrationNumber,
        String firstName,
        String lastName,
        String degree
    ) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    public String toString() {
        return (
            "Registration Number: " +
            registrationNumber +
            ", First Name: " +
            firstName +
            ", Last Name: " +
            lastName +
            ", Degree: " +
            degree
        );
    }
}

public class a2 {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        Student[] students = new Student[10];

        // Input student details
        System.out.println("Enter details for 10 students:");
        for (int i = 0; i < students.length; i++) {
            System.out.print(
                "Enter registration number for student " + (i + 1) + ": "
            );
            String regNumber = mj.nextLine();

            System.out.print("Enter first name for student " + (i + 1) + ": ");
            String firstName = mj.nextLine();

            System.out.print("Enter last name for student " + (i + 1) + ": ");
            String lastName = mj.nextLine();

            System.out.print("Enter degree for student " + (i + 1) + ": ");
            String degree = mj.nextLine();

            students[i] = new Student(regNumber, firstName, lastName, degree);
            System.out.println();
        }

        // Search functionality
        System.out.print(
            "Enter 1 to search by First Name or 2 to search by Last Name: "
        );
        int choice = mj.nextInt();
        mj.nextLine(); // Consume newline character

        System.out.print("Enter the name to search: ");
        String name = mj.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (
                (choice == 1 && student.firstName.equalsIgnoreCase(name)) ||
                (choice == 2 && student.lastName.equalsIgnoreCase(name))
            ) {
                System.out.println("Student found: " + student);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student found with the given name.");
        }
    }
}
