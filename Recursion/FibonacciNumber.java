/*
 * Problem: Fibonacci Number
 *
 * The Fibonacci numbers form a sequence where each number is the
 * sum of the two preceding numbers, starting from 0 and 1.
 *
 * F(0) = 0
 * F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1
 *
 * Given n, calculate F(n).
 *
 * Example:
 * Input:  n = 6
 * Output: 8
 *
 * Explanation:
 * 0, 1, 1, 2, 3, 5, 8
 *
 * Constraints:
 * 0 <= n <= 20
 *
 * =========================================================
 * Approach 1: Intuition / Brute Force - Recursion
 * =========================================================
 *
 * The most natural way to solve the problem is to directly
 * follow the Fibonacci definition:
 *
 * F(n) = F(n - 1) + F(n - 2)
 *
 * We keep breaking the problem into smaller subproblems until
 * we reach the base cases F(0) and F(1).
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n) - Recursive call stack
 *
 * =========================================================
 * Approach 2: Optimized - Iteration
 * =========================================================
 *
 * We only need the previous two Fibonacci numbers to calculate
 * the current number.
 *
 * Therefore, there is no need to store the complete sequence.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * =========================================================
 * Approach 3: Dynamic Programming
 * =========================================================
 *
 * Store the previously calculated Fibonacci numbers in an array.
 * This avoids recalculating the same values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class FibonacciNumber {


    // =========================================================
    // Approach 1: Intuition / Brute Force - Recursion
    // =========================================================

    public static int fibRecursive(int n) {

        // Base case
        if (n <= 1) {
            return n;
        }

        int last = fibRecursive(n - 1);
        int secondLast = fibRecursive(n - 2);

        return last + secondLast;
    }


    // =========================================================
    // Approach 2: Optimized - Iteration
    // =========================================================

    public static int fibIterative(int n) {

        if (n <= 1) {
            return n;
        }

        int secondLast = 0;
        int last = 1;

        for (int i = 2; i <= n; i++) {

            int current = last + secondLast;

            secondLast = last;
            last = current;
        }

        return last;
    }


    // =========================================================
    // Approach 3: Dynamic Programming
    // =========================================================

    public static int fibDP(int n) {

        if (n <= 1) {
            return n;
        }

        int[] fib = new int[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }


    // =========================================================
    // Main Method
    // =========================================================

    public static void main(String[] args) {

        int n = 6;

        System.out.println("Fibonacci Number for n = " + n);

        System.out.println("Brute Force (Recursion): "
                + fibRecursive(n));

        System.out.println("Optimized (Iteration): "
                + fibIterative(n));

        System.out.println("Dynamic Programming: "
                + fibDP(n));
    }
}