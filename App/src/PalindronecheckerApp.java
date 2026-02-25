/**
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 * ==========================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Vidushi
 * @version 2.0
 */

public class PalindronecheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.print("Input text: ");
        String input = "madam"; // Hardcoded string to check

        boolean isPalindrome = true;  // Assume true until proven otherwise

        // Loop only till half the string length
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;  // Exit early if mismatch found
            }
        }

        // Output result
        System.out.println("Input text: " + input);
        System.out.println("is it palindrome? :" + isPalindrome);
    }
}

