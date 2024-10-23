import java.util.Scanner;

public class a3 {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int number = mj.nextInt();
            // Check if the number is even
            if (number % 2 == 0) {
                throw new EvenNumberException(
                    "Even numbers are not allowed: " + number
                );
            }
            System.out.println("You entered an odd number: " + number);
        } catch (EvenNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            mj.close();
        }
    }
}

class EvenNumberException extends Exception {

    public EvenNumberException(String message) {
        super(message);
    }
}
