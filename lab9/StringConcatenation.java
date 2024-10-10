import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);

        // Array to hold the five strings
        String[] strings = new String[5];

        // Accepting five strings from the user
        for (int i = 0; i < strings.length; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = mj.nextLine();
        }

        // Concatenating the strings
        StringBuilder concatenatedString = new StringBuilder();
        for (String str : strings) {
            concatenatedString.append(str);
        }

        // Displaying the concatenated string
        System.out.println("\nConcatenated String: " + concatenatedString.toString());

        mj.close();
    }
}