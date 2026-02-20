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

        // UC3: Palindrome Check Using String Reverse (for loop)
        String original = "racecar";
        String rev = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            rev = rev + original.charAt(i);
        }

        System.out.println("\n--- UC3: Palindrome Check Using String Reverse ---");
        System.out.println("Input String    : " + original);
        System.out.println("Reversed String : " + rev);

        if (original.equals(rev)) {
            System.out.println("\"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + original + "\" is NOT a Palindrome.");
        }
    }
}
