import java.util.Scanner;

public class ArrayOverflowExceptionExample {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);

        // Define the size of the array
        final int ARRAY_SIZE = 5;
        int[] numbers = new int[ARRAY_SIZE];
        int index = 0;

        System.out.println("You can enter up to " + ARRAY_SIZE + " numbers.");

        while (true) {
            System.out.print("Enter a number (or 'stop' to finish): ");
            String input = mj.nextLine();

            // Check if the user wants to stop entering numbers
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                // Try to convert the input to an integer
                int number = Integer.parseInt(input);

                // Try to add the number to the array
                numbers[index] = number;
                index++;

            } catch (NumberFormatException e) {
                // Handle invalid number input
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle array overflow (too many elements added to the array)
                System.out.println("Error: You cannot add more than " + ARRAY_SIZE + " numbers.");
                break;  // Stop the loop when array overflow occurs
            }
        }

        // Display the numbers entered by the user
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        mj.close();
    }
}