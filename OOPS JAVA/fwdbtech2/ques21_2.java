package b_tech_assignment2;

import java.util.Scanner;

public class ques21_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the paragraph from the user
        System.out.println("Enter the paragraph:");
        String paragraph = scanner.nextLine();

        // Initialize variables
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int whitespaceCount = 0;
        int specialCharCount = 0;
        int lineCount = 1; // start at 1 because there is at least one line
        int sentenceCount = 0;

        // Loop through each character in the paragraph
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);

            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                lowercaseCount++;
            }
            // Check if the character is an uppercase letter
            else if (c >= 'A' && c <= 'Z') {
                uppercaseCount++;
            }
            // Check if the character is a whitespace character
            else if (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
                whitespaceCount++;
                if (c == '\n') {
                    lineCount++;
                }
            }
            // Check if the character is a special character
            else {
                specialCharCount++;
            }
            // Check if the character is the end of a sentence
            if (c == '.' || c == '?' || c == '!') {
                sentenceCount++;
            }
        }

        // Print the results
        System.out.println("Number of lowercase letters: " + lowercaseCount);
        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of whitespace characters: " + whitespaceCount);
        System.out.println("Number of special characters: " + specialCharCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of sentences: " + sentenceCount);
    }
}

