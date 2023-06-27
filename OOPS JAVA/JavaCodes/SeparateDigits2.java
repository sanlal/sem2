public class SeparateDigits2 {
    public static void main(String[] args) {
        int number = 123456;
        char[] charArray = Integer.toString(number).toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}
