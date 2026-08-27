/*
 * ============================================================
 *              COUNT ALL DIGITS OF A NUMBER
 * ============================================================
 *
 * Question:
 *
 * You are given an integer n. You need to return the number
 * of digits in the number.
 *
 * The number will have no leading zeroes, except when the
 * number is 0 itself.
 *
 * Example 1:
 * Input:  n = 4
 * Output: 1
 *
 * Explanation:
 * There is only 1 digit in 4.
 *
 * Example 2:
 * Input:  n = 14
 * Output: 2
 *
 * Explanation:
 * There are 2 digits in 14.
 *
 * Example 3:
 * Input:  n = 234
 * Output: 3
 *
 * Explanation:
 * There are 3 digits in 234.
 *
 * Constraints:
 * - 0 <= n <= 5000
 * - n will contain no leading zeroes except when it is 0 itself.
 *
 * ============================================================
 */

import java.util.Scanner;

class Solution {

    /*
     * Function to count the number of digits in n.
     *
     * Approach:
     * We repeatedly divide n by 10.
     *
     * Example:
     * n = 234
     *
     * 234 / 10 = 23  -> count = 1
     *  23 / 10 = 2   -> count = 2
     *   2 / 10 = 0   -> count = 3
     *
     * When n becomes 0, all digits have been counted.
     */
    public static int countDigit(int n) {

        // 0 is a special case because the loop below
        // would not execute for n = 0.
        // The number 0 has exactly one digit.
        if (n == 0) {
            return 1;
        }

        // This variable keeps track of the number of digits.
        int count = 0;

        /*
         * Remove the last digit of n using integer division by 10.
         *
         * For example:
         * 234 -> 23 -> 2 -> 0
         *
         * Each division removes one digit, so we increase
         * count after every division.
         */
        while (n > 0) {
            n = n / 10;
            count++;
        }

        // Return the total number of digits.
        return count;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number.
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Call countDigit() to find the number of digits.
        int digits = countDigit(n);

        // Display the result.
        System.out.println("There are " + digits + " digits in " + n);

        // Close the Scanner.
        sc.close();
    }
}