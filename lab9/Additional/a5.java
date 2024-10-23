import java.util.*;

public class a5 {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        System.out.print("Enter a five-letter word: ");
        String word = mj.nextLine();

        if (word.length() != 5) {
            System.out.println(
                "Please enter a word with exactly five letters."
            );
            return;
        }

        // List to store three-letter combinations.
        List<String> threeLetterWords = new ArrayList<>();

        // Generate all possible three-letter combinations.
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < word.length(); k++) {
                    if (i != j && j != k && i != k) {
                        // Create a three-letter word from different characters.
                        String combination =
                            "" +
                            word.charAt(i) +
                            word.charAt(j) +
                            word.charAt(k);

                        // Add the combination to the list if it's not already there.
                        if (!threeLetterWords.contains(combination)) {
                            threeLetterWords.add(combination);
                        }
                    }
                }
            }
        }

        // Display all unique three-letter words.
        System.out.println("All possible three-letter words:");
        for (String threeLetterWord : threeLetterWords) {
            System.out.println(threeLetterWord);
        }
    }
}
