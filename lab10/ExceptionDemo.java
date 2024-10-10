import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter a number (Enter 0 to trigger CustomException): ");
        int number = scanner.nextInt();

        try {
            // Checking the condition to throw the custom exception
            if (number == 0) {
                throw new CustomException("Error: You entered zero, which is not allowed.");
            } else {
                System.out.println("You entered: " + number);
            }
        } catch (CustomException e) {
            // Handling the custom exception
            System.out.println(e.getMessage());
        } finally {
            // Closing the scanner resource
            scanner.close();
        }
    }
}

// Custom Exception Class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}