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
import java.util.*;
public class PalindronecheckerApp {


        /**
         * Application entry point for UC3.
         *
         * @param args Command-line arguments
         */




        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input text: ");
            String input = sc.nextLine();

            // Build reversed string
            String reversed = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }

            // Check palindrome
            boolean isPalindrome = input.equals(reversed);

            // Output reversed text and palindrome result
            System.out.println("Reversed text: " + reversed);
            System.out.println("Is it palindrome: " + isPalindrome);
        }
    }

