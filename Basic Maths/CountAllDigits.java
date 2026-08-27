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

    public static int countDigit(int n) {

        // Special case: 0 has one digit
        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int digits = countDigit(n);

        System.out.println("There are " + digits + " digits in " + n);

        sc.close();
    }
}