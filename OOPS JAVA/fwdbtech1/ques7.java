package b_tech_assignment1;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of names to read
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        // Read in the names
        String[] names = new String[numNames];
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name #" + (i+1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Sort the names using bubble sort
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j+1]) > 0) {
                    // Swap names[j] with names[j+1]
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }

        // Print the sorted names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

