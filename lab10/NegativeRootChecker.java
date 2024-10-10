import java.util.Scanner;

// Custom Exception Class
class NegativeRootException extends Exception {
    public NegativeRootException(String message) {
        super(message);
    }
}

public class NegativeRootChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter a number to find its square root: ");
        double number;

        try {
            number = Double.parseDouble(scanner.nextLine()); // Read the number

            // Check if the number is negative
            if (number < 0) {
                throw new NegativeRootException("Error: Cannot calculate the square root of a negative number.");
            }

            // Calculate the square root if the number is non-negative
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is: " + squareRoot);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (NegativeRootException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // Close the scanner resource
        }
    }
}