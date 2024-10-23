import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        try {
            int size = mj.nextInt();

            // Check if the size is negative
            if (size < 0) {
                throw new NegativeArraySizeException(
                    "Array size cannot be negative: " + size
                );
            }

            // If the size is valid, create the array
            int[] array = new int[size];
            System.out.println(
                "Array of size " + size + " created successfully."
            );
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            mj.close();
        }
    }
}
