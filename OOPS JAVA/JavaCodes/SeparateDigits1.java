public class SeparateDigits1 {
    public static void main(String[] args) {
        int number = 123456;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
