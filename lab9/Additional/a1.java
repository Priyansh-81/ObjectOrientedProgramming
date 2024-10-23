import java.util.*;

public class a1 {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = mj.nextInt();
        mj.nextLine(); // Consume the newline character

        String[] strings = new String[n];
        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            strings[i] = mj.nextLine();
        }

        // Sort the array in alphabetical order
        Arrays.sort(strings);

        System.out.println("Strings in alphabetical order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
