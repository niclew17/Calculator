import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

class Calculator {

    private Set<String> uniqueIDs; // To keep track of unique IDs

    Calculator() {
        uniqueIDs = new HashSet<>();
    }

    // This will add values together
    int add(int a, int b) {
        return a + b;
    }

    // This will subtract values
    int subtract(int a, int b) {
        return a - b;
    }

    // This will multiply values
    int multiply(int a, int b) {
        return a * b;
    }

    // This will divide values
    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return a / b;
    }

    /*
     Returns the n'th number in the Fibonacci sequence
     */
    int fibonacciNumberFinder(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /*
     Returns binary value of the given int number
     */
    String intToBinaryNumber(int number) {
        return Integer.toBinaryString(number);
    }

    /*
     Create a completely unique String identifier for a given string
     */
    String createUniqueID(String n) {
        if (n == null || n.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }
        String uniqueID;
        do {
            uniqueID = n + UUID.randomUUID().toString(); // Generate a unique ID with the input string
        } while (uniqueIDs.contains(uniqueID));
        uniqueIDs.add(uniqueID);
        return uniqueID;
    }
}
