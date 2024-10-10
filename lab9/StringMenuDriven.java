import java.util.Scanner;

public class StringMenuDriven {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        String str1, str2;

        // Input two strings from the user
        System.out.println("Enter the first string:");
        str1 = mj.nextLine();
        System.out.println("Enter the second string:");
        str2 = mj.nextLine();

        int choice;
        System.out.println("\nMenu:");
        System.out.println("1. Compare two strings");
        System.out.println("2. Convert uppercase characters to lowercase and vice versa");
        System.out.println("3. Check if one string is a substring of the other"); 
        System.out.println("4. Replace substring with 'Hello' if found");
        System.out.println("5. Exit");
        do {
            System.out.print("Enter your choice (1-5): ");
            choice = mj.nextInt();
            mj.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    compareStrings(str1, str2);
                    break;
                case 2:
                    convertCase(str1);
                    convertCase(str2);
                    break;
                case 3:
                    checkSubstring(str1, str2);
                    break;
                case 4:
                    replaceSubstring(str1, str2);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        } while (choice != 5);

        mj.close();
    }

    // Method to compare two strings
    private static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }

    // Method to convert uppercase characters to lowercase and vice versa
    private static void convertCase(String str) {
        StringBuilder converted = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                converted.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                converted.append(Character.toUpperCase(c));
            } else {
                converted.append(c); // Non-alphabetic characters remain the same
            }
        }

        System.out.println("Converted string: " + converted.toString());
    }

    // Method to check if one string is a substring of the other
    private static void checkSubstring(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println("\"" + str2 + "\" is a substring of \"" + str1 + "\".");
        } else if (str2.contains(str1)) {
            System.out.println("\"" + str1 + "\" is a substring of \"" + str2 + "\".");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }
    }

    // Method to replace substring with "Hello" if found
    private static void replaceSubstring(String str1, String str2) {
        if (str1.contains(str2)) {
            String replacedString = str1.replace(str2, "Hello");
            System.out.println("After replacing \"" + str2 + "\" with \"Hello\": " + replacedString);
        } else if (str2.contains(str1)) {
            String replacedString = str2.replace(str1, "Hello");
            System.out.println("After replacing \"" + str1 + "\" with \"Hello\": " + replacedString);
        } else {
            System.out.println("No substring found to replace.");
        }
    }
}