package b_tech_assignment2;

import java.util.Scanner;

public class ques21_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int whitespaceCount = 0;
        int specialCount = 0;
        int lineCount = 1; // start at 1 since there is at least one line
        int sentenceCount = 0;

        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);

            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isWhitespace(c)) {
                whitespaceCount++;
                if (c == '\n') {
                    lineCount++;
                }
            } else {
                specialCount++;
                if (c == '.' || c == '?' || c == '!') {
                    sentenceCount++;
                }
            }
        }

        System.out.println("Number of lowercase letters: " + lowercaseCount);
        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of white spaces: " + whitespaceCount);
        System.out.println("Number of special characters: " + specialCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of sentences: " + sentenceCount);
    }
}

