public class SumAndReverseDigits {
  public static void main(String[] args) {
      int number = 123456;
      int sum = 0;
      char[] charArray = Integer.toString(number).toCharArray();
      for (int i = 0; i < charArray.length; i++) {
          sum += Character.getNumericValue(charArray[i]);
      }
      System.out.println("Sum of digits: " + sum);
      System.out.print("Reverse of digits: ");
      for (int i = charArray.length - 1; i >= 0; i--) {
          System.out.print(charArray[i]);
      }
  }
}
