import java.util.Scanner;

public class SquareMatrixValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the size of the matrix
        int size = 0;
        while (true) {
            try {
                System.out.print("Enter the size of the matrix (n for n x n): ");
                size = Integer.parseInt(scanner.nextLine()); // Read size from user input
                
                // Validate size must be positive
                if (size <= 0) {
                    throw new IllegalArgumentException("Size must be a positive integer.");
                }
                break; // Exit the loop if the input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Initialize the matrix
        int[][] matrix = new int[size][size];

        // Input elements for the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                while (true) {
                    try {
                        System.out.print("Element [" + i + "][" + j + "]: ");
                        matrix[i][j] = Integer.parseInt(scanner.nextLine()); // Read element
                        break; // Exit the loop if input is valid
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a valid integer.");
                    }
                }
            }
        }

        // Validate if the matrix is square
        if (isSquareMatrix(matrix)) {
            System.out.println("The matrix is a square matrix.");
        } else {
            System.out.println("The matrix is not a square matrix.");
        }

        scanner.close();
    }

    // Method to check if a matrix is square
    private static boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;  // Number of rows
        int cols = matrix[0].length;  // Number of columns

        return rows == cols;  // Return true if rows are equal to columns
    }
}