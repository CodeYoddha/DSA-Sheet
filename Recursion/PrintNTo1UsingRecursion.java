/*
 * Problem: Print N to 1 Using Recursion
 *
 * Given an integer n, print all numbers from n to 1 (inclusive)
 * using recursion.
 *
 * Requirements:
 * - Do not use loops such as for, while, or do-while.
 * - Print each number on a separate line.
 * - Print the numbers in decreasing order from n to 1.
 *
 * Example 1:
 * Input:
 * 5
 *
 * Output:
 * 5
 * 4
 * 3
 * 2
 * 1
 *
 * Example 2:
 * Input:
 * 1
 *
 * Output:
 * 1
 *
 * Constraints:
 * 1 <= n <= 100
 *
 * --------------------------------------------------
 * Approach:
 *
 * We print the current value of n first and then make
 * a recursive call with n - 1.
 *
 * The recursion continues until n becomes 0.
 *
 * For n = 5:
 *
 * printNumbers(5)
 *     -> print 5
 *     -> printNumbers(4)
 *         -> print 4
 *         -> printNumbers(3)
 *             -> print 3
 *             -> printNumbers(2)
 *                 -> print 2
 *                 -> printNumbers(1)
 *                     -> print 1
 *                     -> printNumbers(0)
 *                         -> return
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

        // Print the current number
        System.out.println(n);

        // Recursive call with n decreased by 1
        printNumbers(n - 1);
    }
}