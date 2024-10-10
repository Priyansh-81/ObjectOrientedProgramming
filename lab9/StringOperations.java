import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        String originalString;

        // Input the string
        System.out.println("Enter a string:");
        originalString = mj.nextLine();

        System.out.println("\nMenu:");
        System.out.println("1. Check if the string is a palindrome");
        System.out.println("2. Write the string in alphabetical order");
        System.out.println("3. Reverse the string");
        System.out.println("4. Concatenate the original string and the reversed string");
        System.out.println("5. Exit");

        int choice;
        do {
            System.out.print("Enter your choice (1-5): ");
            choice = mj.nextInt();
            mj.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    checkPalindrome(originalString);
                    break;
                case 2:
                    alphabeticalOrder(originalString);
                    break;
                case 3:
                    reverseString(originalString);
                    break;
                case 4:
                    concatenateStrings(originalString);
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        } while (choice != 5);

        mj.close();
    }

    // Method to check if the string is a palindrome
    private static void checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Method to write the string in alphabetical order
    private static void alphabeticalOrder(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println("String in alphabetical order: " + new String(charArray));
    }

    // Method to reverse the string
    private static void reverseString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }

    // Method to concatenate the original string and the reversed string
    private static void concatenateStrings(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        String concatenated = str + reversed;
        System.out.println("Concatenated string: " + concatenated);
    }
}