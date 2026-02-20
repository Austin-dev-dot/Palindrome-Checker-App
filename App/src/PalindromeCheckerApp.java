public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Welcome to Palindrome Checker App    ");
        System.out.println("========================================");
        System.out.println("Application Name    : Palindrome Checker");
        System.out.println("Application Version : 1.0");
        System.out.println("========================================");
        System.out.println("Application started successfully!");
        System.out.println("========================================");

        // UC2: Print a Hardcoded Palindrome Result
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("\n--- UC2: Hardcoded Palindrome Check ---");
        System.out.println("Input String : " + str);

        if (str.equals(reversed)) {
            System.out.println("\"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + str + "\" is NOT a Palindrome.");
        }
    }
}
