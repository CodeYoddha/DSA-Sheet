/*
 * ============================================================
 *                    GCD OF TWO NUMBERS
 * ============================================================
 *
 * Problem Statement:
 *
 * You are given two integers n1 and n2. You need to find the
 * Greatest Common Divisor (GCD) of the two given numbers.
 *
 * Return the GCD of the two numbers.
 *
 * The Greatest Common Divisor (GCD) of two integers is the
 * largest positive integer that divides both of the integers.
 *
 *
 * Example 1:
 *
 * Input: n1 = 4, n2 = 6
 * Output: 2
 *
 * Explanation:
 *
 * Divisors of n1 = 1, 2, 4
 * Divisors of n2 = 1, 2, 3, 6
 *
 * Greatest Common Divisor = 2
 *
 *
 * Example 2:
 *
 * Input: n1 = 9, n2 = 8
 * Output: 1
 *
 * Explanation:
 *
 * Divisors of n1 = 1, 3, 9
 * Divisors of n2 = 1, 2, 4, 8
 *
 * Greatest Common Divisor = 1
 *
 *
 * Now your turn:
 *
 * Input:
 * n1 = 6, n2 = 12
 *
 * Output:
 * 6
 *
 *
 * Constraints:
 *
 * 1 <= n1, n2 <= 1000
 *
 * ============================================================
 *
 * Approach:
 *
 * 1. The GCD cannot be greater than the smaller of n1 and n2.
 *
 * 2. Start checking from the smaller number and move backwards
 *    towards 1.
 *
 * 3. For every number i, check:
 *
 *       n1 % i == 0
 *       n2 % i == 0
 *
 *    If both conditions are true, i divides both numbers.
 *
 * 4. Since we are checking from the largest possible divisor
 *    downwards, the first valid divisor is the GCD.
 *
 * 5. Return that value immediately.
 *
 *
 * Example:
 *
 * n1 = 6, n2 = 12
 *
 * Start from min(6, 12) = 6
 *
 * i = 6
 *
 * 6 % 6 == 0  -> true
 * 12 % 6 == 0 -> true
 *
 * Therefore, GCD = 6.
 *
 *
 * Time Complexity:
 * O(min(n1, n2))
 *
 * Space Complexity:
 * O(1)
 *
 * ============================================================
 */

public class GCDOfTwoNumbers {

    // Method to find the GCD of two numbers
    public static int GCD(int n1, int n2) {

        // The GCD cannot be greater than the smaller number
        int smaller = Math.min(n1, n2);

        // Start from the smaller number and check downwards
        for (int i = smaller; i > 0; i--) {

            // Check whether i divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {

                // Since we are checking from largest to smallest,
                // the first valid divisor is the GCD
                return i;
            }
        }

        // This line is theoretically not required because
        // every positive integer pair has at least GCD = 1.
        return 1;
    }

    // Main method
    public static void main(String[] args) {

        // Input
        int n1 = 6;
        int n2 = 12;

        // Find the GCD
        int answer = GCD(n1, n2);

        // Print the result
        System.out.println(answer);
    }
}