/*
 * ============================================================
 *                    DIVISORS OF A NUMBER
 * ============================================================
 *
 * Problem Statement:
 *
 * You are given an integer n. You need to find all the
 * divisors of n.
 *
 * Return all the divisors of n as an array or list in
 * sorted order.
 *
 * A number which completely divides another number is called
 * its divisor.
 *
 *
 * Example 1:
 *
 * Input:
 * n = 6
 *
 * Output:
 * [1, 2, 3, 6]
 *
 * Explanation:
 * The divisors of 6 are 1, 2, 3, and 6.
 *
 *
 * Example 2:
 *
 * Input:
 * n = 8
 *
 * Output:
 * [1, 2, 4, 8]
 *
 * Explanation:
 * The divisors of 8 are 1, 2, 4, and 8.
 *
 *
 * Now your turn:
 *
 * Input:
 * n = 7
 *
 * Output:
 * [1, 7]
 *
 *
 * Constraints:
 *
 * 1 <= n <= 1000
 *
 * ============================================================
 *
 * Approach:
 *
 * 1. Create an ArrayList to store all the divisors.
 *
 * 2. Start a loop from 1 to n.
 *
 * 3. For every number i, check whether n is completely
 *    divisible by i using:
 *
 *        n % i == 0
 *
 * 4. If the remainder is 0, i is a divisor of n.
 *
 * 5. Add the divisor to the ArrayList.
 *
 * 6. Since we are checking numbers from 1 to n in increasing
 *    order, the divisors are automatically stored in sorted
 *    order.
 *
 * 7. Convert the ArrayList<Integer> into an int[] array.
 *
 * 8. Return the array.
 *
 *
 * Example:
 *
 * n = 7
 *
 * i = 1 -> 7 % 1 == 0 -> Add 1
 * i = 2 -> 7 % 2 != 0
 * i = 3 -> 7 % 3 != 0
 * i = 4 -> 7 % 4 != 0
 * i = 5 -> 7 % 5 != 0
 * i = 6 -> 7 % 6 != 0
 * i = 7 -> 7 % 7 == 0 -> Add 7
 *
 * Result = [1, 7]
 *
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 *
 * ============================================================
 */

import java.util.ArrayList;
import java.util.List;

public class DivisorsOfANumber {

    // Method to find all divisors of n
    public static int[] divisors(int n) {

        // List to store all the divisors
        List<Integer> res = new ArrayList<>();

        // Find all divisors
        for (int i = 1; i <= n; i++) {

            // If n is completely divisible by i,
            // then i is a divisor of n
            if (n % i == 0) {
                res.add(i);
            }
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[res.size()];

        // Copy each element from the list into the array
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        // Return the array of divisors
        return ans;
    }

    // Main method
    public static void main(String[] args) {

        // Input
        int n = 7;

        // Find the divisors of n
        int[] answer = divisors(n);

        // Print the divisors
        System.out.print("Divisors of " + n + " = [");

        for (int i = 0; i < answer.length; i++) {

            System.out.print(answer[i]);

            // Print comma between elements
            if (i < answer.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}