import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {

    // Generic method to swap two elements in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        if (
            index1 < 0 ||
            index2 < 0 ||
            index1 >= array.length ||
            index2 >= array.length
        ) {
            throw new IndexOutOfBoundsException(
                "Invalid indices for swapping."
            );
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = mj.nextInt();
        mj.nextLine(); // Consume newline

        // Taking user input for a String array
        String[] array = new String[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = mj.nextLine();
        }

        System.out.println("Enter the first index to swap:");
        int index1 = mj.nextInt();

        System.out.println("Enter the second index to swap:");
        int index2 = mj.nextInt();

        // Swap the elements and display the result
        try {
            swap(array, index1, index2);
            System.out.println("Swapped array: " + Arrays.toString(array));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        mj.close();
    }
}
