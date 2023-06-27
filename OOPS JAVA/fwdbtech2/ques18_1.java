package b_tech_assignment2;

import java.util.Scanner;

public class ques18_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();

        // Copy str1 to str2 using substring
        String str2 = str1.substring(0);

        System.out.println("Original string: " + str1);
        System.out.println("Copied string: " + str2);
    }
}
