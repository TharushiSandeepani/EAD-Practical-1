/** Compared to bad.java, this version uses clear and descriptive names for classes and methods,
 * includes input validation to handle edge cases, and provides comments for better understanding.
 */

public class good {
    public class FactorialCalculator {
        public static int calculateFactorial(int number) {
            if (number < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers");
            }
            int factorialResult = 1;
            for (int i = 1; i <= number; i++) {
                factorialResult *= i;
            }
            return factorialResult;
        }

        public static void main(String[] args) {
            int number = 5;
            int result = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
}
