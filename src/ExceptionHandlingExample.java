public class ExceptionHandlingExample {

    public static void main(String[] args) {
        // Example 1: Handling ArithmeticException
        try {
            int result = divide(10, 0); // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Example 2: Handling ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[5]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Example 3: Using finally block
        try {
            // Some code that may or may not throw an exception
            System.out.println("No exception occurred");
        } catch (Exception e) {
            System.err.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always be executed");

        }
    }

    // Method that may throw ArithmeticException
    private static int divide(int numerator, int denominator) {
        return numerator / denominator;

    }
}
