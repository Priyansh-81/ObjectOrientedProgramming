import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThreeLetterWordsGenerator {

    // Set of valid three-letter words (for demonstration)
    private static final Set<String> validWords = new HashSet<>();

    static {
        // Commonly used three-letter words
        validWords.add("bat");
        validWords.add("bet");
        validWords.add("the");
        validWords.add("hat");
        validWords.add("tab");
        validWords.add("tea");
        validWords.add("ate");
        validWords.add("eat");
        validWords.add("tab");
        validWords.add("bah");
        validWords.add("mat");
        validWords.add("meh");
        validWords.add("hat");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input five-letter word from user
        System.out.print("Enter a five-letter word: ");
        String inputWord = scanner.nextLine();

        if (inputWord.length() != 5) {
            System.out.println("Please enter exactly five letters.");
        } else {
            Set<String> threeLetterWords = new HashSet<>();
            generateThreeLetterWords(inputWord, "", threeLetterWords);

            // Display the valid three-letter words
            System.out.println("\nThree-letter words derived from \"" + inputWord + "\":");
            for (String word : threeLetterWords) {
                if (validWords.contains(word)) {
                    System.out.println(word);
                }
            }
        }

        scanner.close();
    }

    // Recursive method to generate all combinations of three-letter words
    private static void generateThreeLetterWords(String word, String current, Set<String> result) {
        if (current.length() == 3) {
            result.add(current);
            return;
        }

        for (int i = 0; i < word.length(); i++) {
            // Choose the letter
            char letter = word.charAt(i);
            // Create the new remaining word
            String remaining = word.substring(0, i) + word.substring(i + 1);
            // Recur to generate the next letter
            generateThreeLetterWords(remaining, current + letter, result);
        }
    }
}