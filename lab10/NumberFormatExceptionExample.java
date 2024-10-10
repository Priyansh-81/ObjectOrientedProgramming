import java.util.Scanner;

public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter a number: ");
        String input = mj.nextLine();

        try {
            // Attempting to convert the string to an integer
            int number = Integer.parseInt(input);
            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            // Handling the NumberFormatException
            System.out.println("Error: '" + input + "' is not a valid number.");
        } finally {
            // Closing the scanner resource
            mj.close();
        }
    }
}