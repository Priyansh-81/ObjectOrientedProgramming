import java.util.Scanner;

public class a1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;

        while (true) {
            System.out.print("Enter an integer (-1 to end): ");
            String userInput = scanner.nextLine();

            try {
                input = validateInput(userInput);
                if (input == -1) {
                    break; // Exit the loop if -1 is entered
                }
                sum += input; // Add valid input to sum
            } catch (InputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Sum of entered numbers: " + sum);
    }

    // Method to validate the input
    private static int validateInput(String userInput) throws InputException {
        try {
            // Try parsing the input as an integer
            int number = Integer.parseInt(userInput);
            return number; // Return the valid integer
        } catch (NumberFormatException e) {
            // Check if the input is a floating-point number
            if (userInput.contains(".")) {
                throw new InputException(
                    "Floating point numbers are not allowed."
                );
            } else {
                throw new InputException(
                    "Invalid input. Please enter an integer."
                );
            }
        }
    }
}

class InputException extends Exception {

    public InputException(String message) {
        super(message);
    }
}
