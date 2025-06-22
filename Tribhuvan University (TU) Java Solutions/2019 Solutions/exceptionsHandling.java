/*
Question:
Write a Java program to demonstrate the use of:
- final keyword to declare constants
- throw keyword to manually throw an exception
- throws keyword to declare an exception
- try-catch-finally block for exception handling

The program should divide two integers and handle division by zero using proper exception mechanisms.
*/

public class ExceptionsHandling {

    // Method that declares it may throw ArithmeticException using 'throws'
    public static void divide(int first, int second) throws ArithmeticException {
                // Manually throw an exception if second is 0
        if (second == 0) {
                throw new ArithmeticException("Cannot divide by zero.");  // using 'throw'
        }

        // Perform division and print the result
        int ans = first / second;
        System.out.println("Answer is " + ans);
    }

    public static void main(String[] args) {
        final int first = 10;  // using 'final' to declare a constant
        int second = 0;

        try {
            // Call the method that might throw an exception
            divide(first, second);
        } catch (ArithmeticException e) {
            // Catch and handle ArithmeticException
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This block always executes, even if an exception occurs
            System.out.println("Program continues after handling the exception.");
        }
    }
}
