import java.util.Scanner;

public class a4 {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = mj.nextLine();

        Student student = new Student(studentName);

        try {
            System.out.print("Enter marks for " + student.getName() + ": ");
            int marks = mj.nextInt();
            student.setMarks(marks);
            System.out.println(
                "Marks for " + student.getName() + ": " + student.getMarks()
            );
        } catch (MarkOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(
                "Invalid input. Please enter a valid integer for marks."
            );
        } finally {
            mj.close();
        }
    }
}

class MarkOutOfBoundsException extends Exception {

    public MarkOutOfBoundsException(String message) {
        super(message);
    }
}

class Student {

    private String name;
    private int marks;

    public Student(String name) {
        this.name = name;
    }

    public void setMarks(int marks) throws MarkOutOfBoundsException {
        if (marks > 100) {
            throw new MarkOutOfBoundsException(
                "Marks cannot be greater than 100: " + marks
            );
        }
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
