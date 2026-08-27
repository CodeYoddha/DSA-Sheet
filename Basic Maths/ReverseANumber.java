/*
 * ============================================================
 * Problem: Reverse a Number
 * File Name: ReverseANumber.java
 * ============================================================
 *
 * You are given an integer n.
 * Return the integer formed by placing the digits of n
 * in reverse order.
 *
 * Example 1:
 * Input:  n = 25
 * Output: 52
 *
 * Example 2:
 * Input:  n = 123
 * Output: 321
 *
 * Example 3:
 * Input:  n = 54
 * Output: 45
 *
 * Constraints:
 * 0 <= n <= 5000
 * n will contain no leading zeroes except when it is 0 itself.
 *
 * ============================================================
 * Approach:
 * ============================================================
 *
 * We use the modulo (%) and division (/) operators.
 *
 * 1. n % 10 gives the last digit.
 * 2. Add that digit to revNum.
 * 3. n / 10 removes the last digit.
 * 4. Repeat until n becomes 0.
 *
 * Example: n = 123
 *
 * 123 % 10 = 3  -> last digit
 * revNum = 0 * 10 + 3 = 3
 * n = 123 / 10 = 12
 *
 * 12 % 10 = 2   -> last digit
 * revNum = 3 * 10 + 2 = 32
 * n = 12 / 10 = 1
 *
 * 1 % 10 = 1    -> last digit
 * revNum = 32 * 10 + 1 = 321
 * n = 1 / 10 = 0
 *
 * Answer = 321
 *
 * Time Complexity: O(log10(n))
 * Space Complexity: O(1)
 * ============================================================
 */

public class ReverseANumber {

    // Function to reverse the digits of a number
    public static int reverseNumber(int n) {

        // Stores the reversed number
        int revNum = 0;

        // Process each digit until n becomes 0
        while (n > 0) {

            // Get the last digit of n
            int lastDigit = n % 10;

            // Add the last digit to revNum
            // Multiplying by 10 shifts existing digits to the left
            revNum = revNum * 10 + lastDigit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Return the reversed number
        return revNum;
    }

    // Main method to test the solution
    public static void main(String[] args) {

        // Input
        int n = 54;

        // Call the function
        int result = reverseNumber(n);

        // Print the answer
        System.out.println("Input: " + n);
        System.out.println("Output: " + result);
    }
}