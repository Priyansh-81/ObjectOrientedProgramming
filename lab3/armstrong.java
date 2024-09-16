
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check for Armstrong number:");
        int num = scanner.nextInt();

        int originalNum = num;
        int sum = 0;
        int count = 0;
        int tempNum = num;
        while (tempNum != 0) {
            count++;
            tempNum /= 10;
        }
        tempNum = num;
        while (tempNum != 0) {
            int digit = tempNum % 10;
            sum += Math.pow(digit, count);
            tempNum /= 10;
        }

        if (sum == originalNum) {
            System.out.println("Armstrong number!");
        } else {
            System.out.println("Not an Armstrong number!");
        }

        System.out.println("\nThank you!");
        scanner.close();
    }
}
