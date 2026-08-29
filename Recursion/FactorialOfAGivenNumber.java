/*
 * Problem: Factorial of a Given Number
 *
 * You are given an integer n. Return the value of n! (n factorial).
 *
 * Factorial of a number is the product of all positive integers
 * less than or equal to that number.
 *
 * Example 1:
 * Input:  n = 2
 * Output: 2
 *
 * Explanation:
 * 2! = 1 * 2 = 2
 *
 * Example 2:
 * Input:  n = 0
 * Output: 1
 *
 * Explanation:
 * 0! is defined as 1.
 *
 * Example 3:
 * Input:  n = 3
 * Output: 6
 *
 * Explanation:
 * 3! = 1 * 2 * 3 = 6
 *
 * Constraints:
 * 0 <= n <= 10
 *
 * ---------------------------------------------------------
 * Approach 1: Recursion
 * ---------------------------------------------------------
 *
 * Formula:
 * n! = n * (n - 1)!
 *
 * Base Case:
 * 0! = 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) due to the recursive call stack.
 *
 * ---------------------------------------------------------
 * Approach 2: Iteration
 * ---------------------------------------------------------
 *
 * Start with ans = 1 and multiply it by every number
 * from 1 to n.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class FactorialOfAGivenNumber {

    // Approach 1: Recursive solution
    public static int factorialRecursive(int n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case
        return n * factorialRecursive(n - 1);
    }

    // Approach 2: Iterative solution
    public static int factorialIterative(int n) {

        int ans = 1;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 5;

        // Using recursion
        int recursiveResult = factorialRecursive(n);

        // Using iteration
        int iterativeResult = factorialIterative(n);

        System.out.println("Using Recursion:");
        System.out.println("The factorial of " + n + " is " + recursiveResult);

        System.out.println();

        System.out.println("Using Iteration:");
        System.out.println("The factorial of " + n + " is " + iterativeResult);
    }
}