package b_tech_assignment1;
import java.util.Scanner;

public class ques8 {
   private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
   private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();
      System.out.println(convertNumberToWords(number));
   }

   public static String convertNumberToWords(int number) {
      if (number == 0) {
         return "zero";
      }

      if (number < 0) {
         return "minus " + convertNumberToWords(Math.abs(number));
      }

      String words = "";

      if ((number / 1000000) > 0) {
         words += convertNumberToWords(number / 1000000) + " million ";
         number %= 1000000;
      }

      if ((number / 1000) > 0) {
         words += convertNumberToWords(number / 1000) + " thousand ";
         number %= 1000;
      }

      if ((number / 100) > 0) {
         words += convertNumberToWords(number / 100) + " hundred ";
         number %= 100;
      }

      if (number > 0) {
         if (number < 20) {
            words += units[number];
         } else {
            words += tens[number / 10];
            if ((number % 10) > 0) {
               words += "-" + units[number % 10];
            }
         }
      }

      return words;
   }
}
