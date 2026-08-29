/*
 * Problem: Reverse an Array
 *
 * Given an array arr of n elements, reverse the given array.
 * The reversal of the array should be done in-place.
 *
 * Example:
 * Input:
 * n = 5
 * arr = [1, 2, 3, 4, 5]
 *
 * Output:
 * [5, 4, 3, 2, 1]
 *
 * Constraints:
 * 1 <= n <= 10^4
 * 1 <= arr[i] <= 10^5
 *
 * =========================================================
 * Approach 1: Two Pointers
 * =========================================================
 *
 * Use two pointers:
 * - p1 starts from the beginning.
 * - p2 starts from the end.
 *
 * Swap the elements and move both pointers towards the center.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * =========================================================
 * Approach 2: Using a New Array
 * =========================================================
 *
 * Create a new array and copy the elements from the original
 * array in reverse order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * =========================================================
 * Approach 3: Using Collections.reverse()
 * =========================================================
 *
 * Convert the array into a List and use the built-in
 * Collections.reverse() method.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) extra space for reversing the list.
 */

import java.util.*;

class Solution {

    // ---------------------------------------------------------
    // Approach 1: Two Pointers - In-Place
    // ---------------------------------------------------------

    public void reverseUsingTwoPointers(int[] arr, int n) {

        int p1 = 0;
        int p2 = n - 1;

        while (p1 < p2) {

            // Swap elements
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            // Move pointers
            p1++;
            p2--;
        }
    }


    // ---------------------------------------------------------
    // Approach 2: Using a New Array
    // ---------------------------------------------------------

    public int[] reverseUsingNewArray(int[] arr) {

        int n = arr.length;

        // Create a new array
        int[] ans = new int[n];

        // Copy elements in reverse order
        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - 1 - i];
        }

        return ans;
    }


    // ---------------------------------------------------------
    // Approach 3: Using Collections.reverse()
    // ---------------------------------------------------------

    public void reverseUsingCollections(List<Integer> arr) {

        // Reverse the list in-place
        Collections.reverse(arr);
    }
}


public class ReverseAnArray {

    public static void main(String[] args) {

        Solution obj = new Solution();


        // =====================================================
        // Approach 1: Two Pointers
        // =====================================================

        int[] arr1 = {1, 2, 3, 4, 5};

        obj.reverseUsingTwoPointers(arr1, arr1.length);

        System.out.print("Two Pointers: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.println();


        // =====================================================
        // Approach 2: Using a New Array
        // =====================================================

        int[] arr2 = {1, 2, 3, 4, 5};

        int[] result = obj.reverseUsingNewArray(arr2);

        System.out.print("New Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();


        // =====================================================
        // Approach 3: Using Collections.reverse()
        // =====================================================

        List<Integer> arr3 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        obj.reverseUsingCollections(arr3);

        System.out.print("Collections.reverse(): ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}