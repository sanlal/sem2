public class SumAndReverseDigits {
  public static void main(String[] args) {
      int number = 123456;
      int sum = 0;
      String str = Integer.toString(number);
      StringBuilder reverse = new StringBuilder(str);
      for (int i = 0; i < str.length(); i++) {
          sum += str.charAt(i) - '0';
      }
      System.out.println("Sum of digits: " + sum);
      System.out.println("Reverse of digits: " + reverse.reverse());
  }
}
