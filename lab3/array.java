import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // Initialize the array
        int[] a = {1, 2, 3, 1, 2, 1, 5, 6, 7};

        Scanner mj= new Scanner(System.in);

        System.out.println("Enter the value to be searched: ");
        int searchValue = mj.nextInt();

        // Initialize a flag to check if the value is found
        boolean found = false;
        System.out.print("The value is found at locations: ");
        int index = 0;
        for (int value : a) {
            if (value == searchValue) {
                if (found) {
                    System.out.print(", ");
                }
                System.out.print("a[" + index + "]");
                found = true;
            }
            index++;
        }
        if (!found) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println();
        }
        mj.close();
    }
}
