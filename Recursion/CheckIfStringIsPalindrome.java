/*
 * ============================================================
 *            CHECK IF STRING IS PALINDROME OR NOT
 * ============================================================
 *
 * Problem Statement:
 *
 * Given a string s, return true if the string is a palindrome,
 * otherwise return false.
 *
 * A string is called a palindrome if it reads the same forward
 * and backward.
 *
 *
 * Example 1:
 *
 * Input:
 * s = "hannah"
 *
 * Output:
 * true
 *
 * Explanation:
 * The string when reversed is --> "hannah"
 * which is the same as the original string,
 * so we return true.
 *
 *
 * Example 2:
 *
 * Input:
 * s = "aabbaA"
 *
 * Output:
 * false
 *
 * Explanation:
 * The string when reversed is --> "Aabbaa"
 * which is not the same as the original string,
 * so we return false.
 *
 *
 * Now your turn:
 *
 * Input:
 * s = "aabbcccdbbaa"
 *
 * Output:
 * false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 10^3
 *
 * s consists of only uppercase and lowercase English characters.
 *
 * ============================================================
 *
 * Approach:
 *
 * We use the Two Pointer technique.
 *
 * 1. Set one pointer at the beginning of the string (left).
 *
 * 2. Set another pointer at the end of the string (right).
 *
 * 3. Compare the characters at left and right.
 *
 * 4. Convert both characters to lowercase before comparing
 *    so that uppercase and lowercase characters are treated
 *    as the same.
 *
 * 5. If the characters are different, return false.
 *
 * 6. If they are the same, move left forward and right backward.
 *
 * 7. Continue until the two pointers meet.
 *
 * 8. If no mismatch is found, return true.
 *
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 *
 * ============================================================
 */

public class CheckIfStringIsPalindrome {

    // Method to check whether the given string is a palindrome
    public static boolean palindromeCheck(String s) {

        // Pointer starting from the beginning
        int left = 0;

        // Pointer starting from the end
        int right = s.length() - 1;

        // Continue until the two pointers meet
        while (left < right) {

            // If the left character is not a letter or digit,
            // move the left pointer forward
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // If the right character is not a letter or digit,
            // move the right pointer backward
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare both characters after converting them
            // to lowercase
            else if (Character.toLowerCase(s.charAt(left))
                    != Character.toLowerCase(s.charAt(right))) {

                // Characters are different, so it is not a palindrome
                return false;
            }

            // Characters are equal, so move both pointers
            // towards the center
            else {
                left++;
                right--;
            }
        }

        // If no mismatch was found, the string is a palindrome
        return true;
    }

    // Main method
    public static void main(String[] args) {

        // Input
        String s = "aabbcccdbbaa";

        // Check whether the string is a palindrome
        boolean answer = palindromeCheck(s);

        // Print the result
        System.out.println(answer);
    }
}