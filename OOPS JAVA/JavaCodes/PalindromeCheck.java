public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "solos";
        String reverse = new StringBuilder(input).reverse().toString();
        if (input.equals(reverse)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
