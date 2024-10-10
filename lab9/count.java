import java.util.Scanner;

public class count {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);

        // Input string from user
        System.out.println("Enter a string:");
        String input = mj.nextLine();

        // Count characters, words, lines, and vowels
        int characterCount = countCharacters(input);
        int wordCount = countWords(input);
        int lineCount = countLines(input);
        int vowelCount = countVowels(input);

        // Display results
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of vowels: " + vowelCount);

        mj.close();
    }

    // Method to count characters
    private static int countCharacters(String str) {
        return str.length(); // Using String's length() method
    }

    // Method to count words
    private static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isWhitespace(c)) {
                if (inWord) {
                    inWord = false; // End of a word
                }
            } else {
                if (!inWord) {
                    inWord = true; // Start of a new word
                    count++;
                }
            }
        }
        return count;
    }

    // Method to count lines
    private static int countLines(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\n') {
                count++;
            }
        }
        // Add one more for the last line if it doesn't end with a newline
        return count + (str.isEmpty() ? 0 : 1);
    }

    // Method to count vowels
    private static int countVowels(String str) {
        String vowels = "AEIOUaeiou"; // Vowel characters
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) != -1) { // Checking if the character is a vowel
                count++;
            }
        }
        return count;
    }
}