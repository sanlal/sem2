public class PalindromeCheck2 {
    public static void main(String[] args) {
        String input = "amima";
        char[] charArray = input.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
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
