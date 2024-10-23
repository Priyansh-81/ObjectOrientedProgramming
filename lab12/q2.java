import java.util.Scanner;

// Generic Stack class using an array
class Stack<T> {

    private T[] elements;
    private int top;
    private int capacity;

    // Constructor to initialize the stack with a specified capacity
    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        elements = (T[]) new Object[capacity]; // Create a generic array
        top = -1; // Stack is initially empty
    }

    // Push element onto the stack
    public void push(T element) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack is full. Cannot push.");
        }
        elements[++top] = element;
    }

    // Pop element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        return elements[top--];
    }

    // Peek the top element of the stack
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return elements[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

// Student class
class Student {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}

// Employee class
class Employee {

    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}

public class q2 {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);

        System.out.println("Choose the type of stack:");
        System.out.println("1. Student Stack");
        System.out.println("2. Employee Stack");
        int choice = mj.nextInt();
        mj.nextLine(); // Consume the newline character

        System.out.println("Enter the capacity of the stack:");
        int capacity = mj.nextInt();
        mj.nextLine(); // Consume the newline character

        if (choice == 1) {
            // Create a stack for Student objects
            Stack<Student> studentStack = new Stack<>(capacity);

            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Push Student");
                System.out.println("2. Pop Student");
                System.out.println("3. Peek Student");
                System.out.println("4. Display Stack");
                System.out.println("5. Exit");
                int operation = mj.nextInt();
                mj.nextLine(); // Consume the newline character

                try {
                    switch (operation) {
                        case 1:
                            System.out.println("Enter Student Name:");
                            String name = mj.nextLine();
                            System.out.println("Enter Student ID:");
                            int id = mj.nextInt();
                            studentStack.push(new Student(name, id));
                            break;
                        case 2:
                            Student removedStudent = studentStack.pop();
                            System.out.println(
                                "Popped Student: " + removedStudent
                            );
                            break;
                        case 3:
                            System.out.println(
                                "Top Student: " + studentStack.peek()
                            );
                            break;
                        case 4:
                            System.out.println(
                                "Student Stack: " + studentStack
                            );
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            return;
                        default:
                            System.out.println(
                                "Invalid operation. Please choose again."
                            );
                    }
                } catch (RuntimeException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } else if (choice == 2) {
            // Create a stack for Employee objects
            Stack<Employee> employeeStack = new Stack<>(capacity);

            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Push Employee");
                System.out.println("2. Pop Employee");
                System.out.println("3. Peek Employee");
                System.out.println("4. Display Stack");
                System.out.println("5. Exit");
                int operation = mj.nextInt();
                mj.nextLine(); // Consume the newline character

                try {
                    switch (operation) {
                        case 1:
                            System.out.println("Enter Employee Name:");
                            String name = mj.nextLine();
                            System.out.println("Enter Employee Department:");
                            String department = mj.nextLine();
                            employeeStack.push(new Employee(name, department));
                            break;
                        case 2:
                            Employee removedEmployee = employeeStack.pop();
                            System.out.println(
                                "Popped Employee: " + removedEmployee
                            );
                            break;
                        case 3:
                            System.out.println(
                                "Top Employee: " + employeeStack.peek()
                            );
                            break;
                        case 4:
                            System.out.println(
                                "Employee Stack: " + employeeStack
                            );
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            return;
                        default:
                            System.out.println(
                                "Invalid operation. Please choose again."
                            );
                    }
                } catch (RuntimeException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } else {
            System.out.println("Invalid choice. Exiting.");
        }

        mj.close();
    }
}
