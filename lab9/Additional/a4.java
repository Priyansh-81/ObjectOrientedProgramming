import java.util.Scanner;

public class a4 {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        System.out.print(
            "Enter a telephone number in the form (555) 555-5555: "
        );
        String phoneNumber = mj.nextLine();

        // Extract the area code using substring method
        String areaCode = phoneNumber.substring(
            phoneNumber.indexOf('(') + 1,
            phoneNumber.indexOf(')')
        );
        // Extract the first three digits of the phone number
        String firstThreeDigits = phoneNumber.substring(
            phoneNumber.indexOf(' ') + 1,
            phoneNumber.indexOf('-')
        );
        // Extract the last four digits of the phone number
        String lastFourDigits = phoneNumber.substring(
            phoneNumber.indexOf('-') + 1
        );

        // Display the area code and seven-digit phone number
        System.out.println("Area Code: " + areaCode);
        System.out.println(
            "Seven-Digit Phone Number: " +
            firstThreeDigits +
            "-" +
            lastFourDigits
        );
    }
}
