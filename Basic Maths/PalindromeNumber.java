/*
 * ============================================================
 *                    PALINDROME NUMBER
 * ============================================================
 *
 * Problem Statement:
 *
 * You are given an integer n. You need to check whether the
 * number is a palindrome number or not.
 *
 * Return true if it's a palindrome number, otherwise return
 * false.
 *
 * A palindrome number is a number which reads the same both
 * left to right and right to left.
 *
 * Example 1:
 *
 * Input: n = 121
 * Output: true
 *
 * Explanation:
 * When read from left to right : 121
 * When read from right to left : 121
 *
 *
 * Example 2:
 *
 * Input: n = 123
 * Output: false
 *
 * Explanation:
 * When read from left to right : 123
 * When read from right to left : 321
 *
 *
 * Input:
 * 101
 *
 * Output:
 * true
 *
 *
 * Constraints:
 *
 * 0 <= n <= 5000
 *
 * n will contain no leading zeroes except when it is 0 itself.
 *
 * ============================================================
 *
 * Approach:
 *
 * 1. Store the original number in a separate variable.
 * 2. Reverse the given number using the following steps:
 *      - Get the last digit using n % 10.
 *      - Add the digit to the reversed number.
 *      - Remove the last digit using n / 10.
 * 3. Compare the original number with the reversed number.
 * 4. If both are equal, the number is a palindrome.
 *
 * Time Complexity: O(log10(n))
 * Space Complexity: O(1)
 *
 * ============================================================
 */

public class PalindromeNumber {

    // Method to check whether a number is a palindrome
    public static boolean isPalindrome(int n) {

        // Store the original number because n will be modified
        int dup = n;

        // Variable to store the reversed number
        int revNum = 0;

        // Continue until all digits of n are processed
        while (n > 0) {

            // Extract the last digit of the number
            int lastDigit = n % 10;

            // Add the last digit to the reversed number
            // Example: revNum = 12 and lastDigit = 3
            // revNum becomes 123
            revNum = (revNum * 10) + lastDigit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Compare the original number with the reversed number
        // If they are equal, the number is a palindrome
        return dup == revNum;
    }

    // Main method
    public static void main(String[] args) {

        // Input number
        int n = 101;

        // Check whether the number is a palindrome
        boolean answer = isPalindrome(n);

        // Print the result
        System.out.println(answer);
    }
}