/*
 * Problem: Sum of First N Numbers
 *
 * Given an integer N, return the sum of the first N natural numbers.
 *
 * Example:
 * Input:  N = 4
 * Output: 10
 *
 * Explanation:
 * 1 + 2 + 3 + 4 = 10
 *
 * Formula:
 * Sum = N * (N + 1) / 2
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class SumOfFirstNNumbers {

    public static int NnumbersSum(int N) {
        return (N * (N + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        int N = sc.nextInt();

        // Calculate and print the sum
        int result = NnumbersSum(N);

        System.out.println(result);

        sc.close();
    }
}