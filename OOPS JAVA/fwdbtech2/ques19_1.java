package b_tech_assignment2;

import java.util.Scanner;

public class ques19_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.println("Enter the substring to replace: ");
        String substringToReplace = scanner.nextLine();

        System.out.println("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        // Replace the substring with the new substring
        String newString = originalString.replace(substringToReplace, newSubstring);

        System.out.println("Original string: " + originalString);
        System.out.println("New string: " + newString);
    }
}
