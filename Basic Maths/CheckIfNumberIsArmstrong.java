/*
 * ============================================================
 *              CHECK IF THE NUMBER IS ARMSTRONG
 * ============================================================
 *
 * Problem Statement:
 *
 * You are given an integer n. You need to check whether it is
 * an Armstrong number or not.
 *
 * Return true if it is an Armstrong number, otherwise return
 * false.
 *
 * An Armstrong number is a number which is equal to the sum
 * of the digits of the number, raised to the power of the
 * number of digits.
 *
 *
 * Example 1:
 *
 * Input: n = 153
 * Output: true
 *
 * Explanation:
 *
 * Number of digits = 3
 *
 * 1^3 + 5^3 + 3^3
 * = 1 + 125 + 27
 * = 153
 *
 * Therefore, it is an Armstrong number.
 *
 *
 * Example 2:
 *
 * Input: n = 12
 * Output: false
 *
 * Explanation:
 *
 * Number of digits = 2
 *
 * 1^2 + 2^2
 * = 1 + 4
 * = 5
 *
 * Therefore, it is not an Armstrong number.
 *
 *
 * Now your turn:
 *
 * Input:
 * n = 370
 *
 * Output:
 * true
 *
 * Explanation:
 *
 * Number of digits = 3
 *
 * 3^3 + 7^3 + 0^3
 * = 27 + 343 + 0
 * = 370
 *
 * Therefore, it is an Armstrong number.
 *
 *
 * Constraints:
 *
 * 0 <= n <= 10^9
 *
 * ============================================================
 *
 * Approach:
 *
 * 1. Find the number of digits in n using String.valueOf(n).
 *
 * 2. Store the original number because n will be changed
 *    while extracting its digits.
 *
 * 3. Extract each digit using n % 10.
 *
 * 4. Raise each digit to the power of the number of digits
 *    using Math.pow().
 *
 * 5. Add all the calculated values to sum.
 *
 * 6. Remove the last digit using n /= 10.
 *
 * 7. Finally, compare sum with the original number.
 *
 *    If sum == original, the number is an Armstrong number.
 *
 *
 * Time Complexity:
 * O(log10(n))
 *
 * Space Complexity:
 * O(1)
 *
 * ============================================================
 */

public class CheckIfNumberIsArmstrong {

    // Method to check whether a number is an Armstrong number
    public static boolean isArmstrong(int n) {

        // Find the number of digits in n
        int k = String.valueOf(n).length();

        // Variable to store the sum of powered digits
        int sum = 0;

        // Store the original number because n will be modified
        int original = n;

        // Extract and process each digit
        while (n > 0) {

            // Get the last digit
            int lastDigit = n % 10;

            // Raise the digit to the power of number of digits
            // and add it to the sum
            sum += (int) Math.pow(lastDigit, k);

            // Remove the last digit
            n /= 10;
        }

        // Check whether the calculated sum is equal
        // to the original number
        return sum == original;
    }

    // Main method
    public static void main(String[] args) {

        // Input
        int n = 370;

        // Check whether n is an Armstrong number
        boolean answer = isArmstrong(n);

        // Print the result
        System.out.println(answer);
    }
}