import java.util.ArrayList;
import java.util.List;

public class q4 {

    // Method using an unbounded wildcard - accepts any type of list
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    // Method using an upper bounded wildcard - accepts a list of Number or its subclasses
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue(); // Safe to call doubleValue() since it's bounded by Number
        }
        return sum;
    }

    // Method using a lower bounded wildcard - accepts a list of Integer or any of its superclasses
    public static void addIntegers(List<? super Integer> list) {
        list.add(42); // Adding an Integer is safe
        list.add(99);
    }

    public static void main(String[] args) {
        // Example 1: Using an unbounded wildcard
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("Unbounded Wildcard:");
        printList(stringList); // Works because of <?>

        // Example 2: Using an upper bounded wildcard
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        System.out.println("\nUpper Bounded Wildcard:");
        System.out.println("Sum of integerList: " + sumOfList(integerList));

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        System.out.println("Sum of doubleList: " + sumOfList(doubleList));

        // Example 3: Using a lower bounded wildcard
        List<Number> numberList = new ArrayList<>();
        numberList.add(3.14);
        System.out.println("\nLower Bounded Wildcard:");
        addIntegers(numberList);
        System.out.println("After adding integers: " + numberList);
        // Note: addIntegers would also work with List<Object> since it's a superclass of Integer
    }
}
