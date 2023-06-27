package b_tech_assignment2;

import java.util.Scanner;

public class ques19_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.println("Enter the substring to replace: ");
        String substringToReplace = scanner.nextLine();

        System.out.println("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        // Find the index of the substring to replace
        int index = indexOfSubstring(originalString, substringToReplace);

        // If the substring is not found, print an error message and exit the program
        if (index == -1) {
            System.out.println("Error: Substring not found.");
            System.exit(1);
        }

        // Create a new string by concatenating the part of the original string
        // before the substring, the new substring, and the part of the original string
        // after the substring
        String newString = replaceSubstring(originalString, substringToReplace, newSubstring);

        System.out.println("Original string: " + originalString);
        System.out.println("New string: " + newString);
    }

    public static int indexOfSubstring(String originalString, String substringToFind) {
        int len1 = originalString.length();
        int len2 = substringToFind.length();

        // If the length of the substring to find is greater than the length of
        // the original string, it is not possible to find the substring
        if (len1 < len2) {
            return -1;
        }

        for (int i = 0; i <= len1 - len2; i++) {
            int j;

            // Check if the substring is present at the current index
            for (j = 0; j < len2; j++) {
                if (originalString.charAt(i + j) != substringToFind.charAt(j)) {
                    break;
                }
            }

            // If the substring is found, return the index
            if (j == len2) {
                return i;
            }
        }

        // If the substring is not found, return -1
        return -1;
    }

    public static String replaceSubstring(String originalString, String substringToReplace, String newSubstring) {
        StringBuilder result = new StringBuilder();
        int index = indexOfSubstring(originalString, substringToReplace);

        // If the substring to replace is not found, return the original string
        if (index == -1) {
            return originalString;
        }

        int len1 = originalString.length();
        int len2 = substringToReplace.length();

        // Append the part of the original string before the substring to replace
        result.append(originalString.substring(0, index));

        // Append the new substring
        result.append(newSubstring);

        // Append the part of the original string after the substring to replace
        result.append(originalString.substring(index + len2));

        return result.toString();
    }
}


