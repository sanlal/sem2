public class SeparateDigits {
    public static void main(String[] args) {
        int number = 123456;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}
