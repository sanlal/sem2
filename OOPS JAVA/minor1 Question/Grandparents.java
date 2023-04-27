import java.util.Scanner;
import java.io.*;

public class Grandparents {
    public static void main(String[] args) {
        // Initialize the arrays
        String[] grandparents = {"Grandparent A", "Grandparent B", "Grandparent C"};
        String[] grandchildren = {"Grandchild A1", "Grandchild A2", "Grandchild A3",
                                  "Grandchild B1", "Grandchild B2",
                                  "Grandchild C1", "Grandchild C2", "Grandchild C3", "Grandchild C4"};
        int[] numGrandchildren = {3, 2, 4}; // Each grandparent has 3, 2, and 4 grandchildren respectively

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a grandparent's name
        System.out.print("Enter a grandparent's name: ");
        String grandparentName = input.nextLine();

        // Search for the grandparent's index in the grandparents array
        int grandparentIndex = -1;
        for (int i = 0; i < grandparents.length; i++) {
            if (grandparents[i].equals(grandparentName)) {
                grandparentIndex = i;
                break;
            }
        }

        // If the grandparent is found, print the names of their grandchildren
        if (grandparentIndex != -1) {
            int startChildIndex = 0;
            for (int i = 0; i < grandparentIndex; i++) {
                startChildIndex += numGrandchildren[i];
            }
            int endChildIndex = startChildIndex + numGrandchildren[grandparentIndex];
            System.out.print("The grandchildren of " + grandparentName + " are: ");
            for (int i = startChildIndex; i < endChildIndex; i++) {
                System.out.print(grandchildren[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Grandparent not found.");
        }
    }
}
