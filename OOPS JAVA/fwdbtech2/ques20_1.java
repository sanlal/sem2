package b_tech_assignment2;

import java.util.Scanner;

public class ques20_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Using the + operator
        String result1 = str1 + " " + str2;
        System.out.println("Using the + operator: " + result1);

        // Using the concat() method
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Using the concat() method: " + result2);
    }
}

