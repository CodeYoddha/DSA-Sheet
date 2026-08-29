/*
 * Problem: Print 1 to N Using Recursion
 *
 * Given an integer n, print all numbers from 1 to n (inclusive)
 * using recursion.
 *
 * Requirements:
 * - Do not use loops such as for, while, or do-while.
 * - Print each number on a separate line.
 * - Print the numbers in increasing order.
 *
 * Example:
 * Input:  n = 5
 *
 * Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 *
 * Constraints:
 * 1 <= n <= 100
 *
 * --------------------------------------------------
 * Approach:
 *
 * We use recursion to solve this problem.
 *
 * 1. If n becomes 0, stop the recursion.
 * 2. Call printNumbers(n - 1).
 * 3. Print n after the recursive call.
 *
 * The recursive call is made before printing so that the
 * numbers are printed in increasing order.
 *
 * For n = 5:
 *
 * printNumbers(5)
 *     -> printNumbers(4)
 *         -> printNumbers(3)
 *             -> printNumbers(2)
 *                 -> printNumbers(1)
 *                     -> printNumbers(0)
 *
 * When n becomes 0, recursion stops.
 * Then the calls return one by one and print:
 *
 * 1
 * 2
 * 3
 * 4
 * 5
 *
 * --------------------------------------------------
 * Complexity:
 *
 * Time Complexity:  O(n)
 * Space Complexity: O(n)
 *                   (due to the recursion call stack)
 */

class Solution {

    public void printNumbers(int n) {

        // Base case: stop when n reaches 0
        if (n == 0) {
            return;
        }

        // Recursive call
        printNumbers(n - 1);

        // Print after recursion to get increasing order
        System.out.println(n);
    }
}