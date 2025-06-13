public class exceptionsHandling {

    // Method that declares it may throw ArithmeticException
    public static void divide(int first, int second) throws ArithmeticException {
        if (second == 0) {
            throw new ArithmeticException("Cannot divide by zero.");  // using 'throw'
        }
        int ans = first / second;
        System.out.println("Answer is " + ans);
    }

    public static void main(String[] args) {
        final int first = 10;  // using 'final'
        int second = 0;

        try {
            divide(first, second);  // this may throw exception
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program continues after handling the exception.");
        }
    }
}
