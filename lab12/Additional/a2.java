public class a2 {

    // Generic method to return the largest of three comparable objects
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a; // Assume a is the maximum initially

        // Compare with b
        if (b.compareTo(max) > 0) {
            max = b; // b is larger than current max
        }

        // Compare with c
        if (c.compareTo(max) > 0) {
            max = c; // c is larger than current max
        }

        return max; // Return the largest value
    }

    public static void main(String[] args) {
        // Test with Integer
        Integer int1 = 10;
        Integer int2 = 20;
        Integer int3 = 15;
        System.out.println("Largest Integer: " + findMax(int1, int2, int3));

        // Test with Double
        Double double1 = 5.5;
        Double double2 = 7.2;
        Double double3 = 6.8;
        System.out.println(
            "Largest Double: " + findMax(double1, double2, double3)
        );

        // Test with String
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Cherry";
        System.out.println("Largest String: " + findMax(str1, str2, str3));
    }
}
