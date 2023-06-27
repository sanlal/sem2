package b_tech_assignment2;


import java.util.Scanner;

public class ques18_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();

        String str2 = "";

        // Copy str1 to str2 using a loop
        for (int i = 0; i < str1.length(); i++) {
            str2 += str1.charAt(i);
        }

        System.out.println("Original string: " + str1);
        System.out.println("Copied string: " + str2);
    }
}

