import java.util.Arrays;
import java.util.Scanner;

public class SortStringsArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of strings
        System.out.print("Enter the number of strings you want to sort: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] strings = new String[n];

        // Accepting strings from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Sort the array of strings
        Arrays.sort(strings);

        // Displaying the sorted array
        System.out.println("\nStrings in alphabetical order:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}