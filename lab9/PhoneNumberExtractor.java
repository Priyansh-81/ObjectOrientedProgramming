import java.util.Scanner;

public class PhoneNumberExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input telephone number from user
        System.out.print("Enter the telephone number in the format (555) 555-5555: ");
        String phoneNumber = scanner.nextLine();

        // Extracting the area code
        String areaCode = phoneNumber.substring(1, 4); // Extracts characters from index 1 to 3 (inclusive)

        // Extracting the first three digits of the phone number
        String firstThreeDigits = phoneNumber.substring(6, 9); // Extracts characters from index 6 to 8 (inclusive)

        // Extracting the last four digits of the phone number
        String lastFourDigits = phoneNumber.substring(10, 14); // Extracts characters from index 10 to 13 (inclusive)

        // Displaying the results
        System.out.println("\nArea Code: " + areaCode);
        System.out.println("Seven-Digit Phone Number: " + firstThreeDigits + "-" + lastFourDigits);

        scanner.close();
    }
}