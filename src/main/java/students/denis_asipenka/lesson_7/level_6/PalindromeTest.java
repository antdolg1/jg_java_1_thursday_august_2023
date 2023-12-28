package students.denis_asipenka.lesson_7.level_6;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.differentRegistersTest();
        test.wordIsNotPalindrome();
        test.theWordPalindrome();
    }

    void differentRegistersTest() {
        String stringPalindrome = "А роза упала на лапу Азора";
        Palindrome palindrome = new Palindrome();
        checkTestResult(palindrome.isPalindrome(stringPalindrome), "Test for contents of different registers");
    }

    void wordIsNotPalindrome() {
        String stringPalindrome = "rotort";
        Palindrome palindrome = new Palindrome();
        checkTestResult(palindrome.isPalindrome(stringPalindrome), "The word is not a palindrome");
    }

    void theWordPalindrome() {
        String stringPalindrome = "rotor";
        Palindrome palindrome = new Palindrome();
        checkTestResult(palindrome.isPalindrome(stringPalindrome), "The word is a palindrome");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}