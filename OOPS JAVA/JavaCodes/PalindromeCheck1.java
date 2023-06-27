public class PalindromeCheck1 {
    public static void main(String[] args) {
        String input = "solos";
        int n = input.length();
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
