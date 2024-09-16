import java.util.Scanner;
public class Number {
    // Private instance variable to hold the double value
    private double value;

    // Constructor to initialize the value
    public Number(double value) {
        this.value = value;
    }

    // Method to check if the number is zero
    public boolean isZero() {
        return value == 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return value > 0;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return value < 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        // Check if the number is an integer
        if (value % 1 == 0) {
            // Convert to integer and check for oddness
            return ((int) value) % 2 != 0;
        }
        return false; // Not applicable for non-integers
    }

    // Method to check if the number is even
    public boolean isEven() {
        // Check if the number is an integer
        if (value % 1 == 0) {
            // Convert to integer and check for evenness
            return ((int) value) % 2 == 0;
        }
        return false; // Not applicable for non-integers
    }

    // Method to check if the number is prime
    public boolean isPrime() {
        // Prime numbers are greater than 1
        if (value <= 1 || value % 1 != 0) {
            return false;
        }
        int intValue = (int) value;
        for (int i = 2; i <= Math.sqrt(intValue); i++) {
            if (intValue % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the number is an Armstrong number
    public boolean isArmstrong() {
        // Armstrong numbers are positive integers
        if (value < 0 || value % 1 != 0) {
            return false;
        }
        int intValue = (int) value;
        int original = intValue;
        int sum = 0;
        int numDigits = String.valueOf(intValue).length();
        while (intValue != 0) {
            int digit = intValue % 10;
            sum += Math.pow(digit, numDigits);
            intValue /= 10;
        }
        return sum == original;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner mj=new Scanner(System.in);
        System.out.println("Enter Number to check:");
        int num=mj.nextInt();
        mj.close();
        Number number = new Number(num); // Example: 153 is an Armstrong number

        System.out.println("Is zero? " + number.isZero());
        System.out.println("Is positive? " + number.isPositive());
        System.out.println("Is negative? " + number.isNegative());
        System.out.println("Is odd? " + number.isOdd());
        System.out.println("Is even? " + number.isEven());
        System.out.println("Is prime? " + number.isPrime());
        System.out.println("Is Armstrong? " + number.isArmstrong());
    }
}
