/*
 * Problem: Check for Prime Number
 *
 * You are given an integer n. You need to check if the number is prime or not.
 * Return true if it is a prime number, otherwise return false.
 *
 * A prime number is a number which has no divisors except 1 and itself.
 *
 * Example 1:
 * Input: n = 5
 * Output: true
 *
 * Explanation:
 * The only divisors of 5 are 1 and 5, so 5 is a prime number.
 *
 * Example 2:
 * Input: n = 8
 * Output: false
 *
 * Explanation:
 * The divisors of 8 are 1, 2, 4, and 8.
 * Therefore, 8 is not a prime number.
 *
 * Example 3:
 * Input: n = 9
 * Output: false
 *
 * Explanation:
 * The divisors of 9 are 1, 3, and 9.
 * Since 9 has more than two divisors, it is not a prime number.
 *
 * Constraints:
 * 1 <= n <= 5000
 *
 *
 * Approach:
 *
 * A prime number has exactly two divisors:
 * 1 and the number itself.
 *
 * We loop from 1 to n and check how many numbers divide n
 * completely using the modulo (%) operator.
 *
 * If n % i == 0, then i is a divisor of n, so we increase
 * the divisor count.
 *
 * At the end:
 * - If the divisor count is exactly 2, return true.
 * - Otherwise, return false.
 *
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isPrime(int n) {

        // Count the number of divisors
        int cnt = 0;

        // Check every number from 1 to n
        for (int i = 1; i <= n; i++) {

            // If i divides n completely, it is a divisor
            if (n % i == 0) {
                cnt++;
            }
        }

        // Prime numbers have exactly 2 divisors
        return cnt == 2;
    }

    public static void main(String[] args) {

        // Create an object of Solution class
        Solution obj = new Solution();

        // Input
        int n = 9;

        // Call isPrime() and print the result
        System.out.println(obj.isPrime(n));
    }
}