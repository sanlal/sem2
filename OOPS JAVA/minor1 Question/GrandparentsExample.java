/* Question 5
 Relationships can be modeled using arrays.Let there be three arrays.
 The first two are of character pointers and the last one is of integers.
The first one, say for example stores the names of the grandparents, 
second one the name of the grandchildren and the third one will store the number of 
grandchildren each grandparent has.
write a program that will allow the users to enter a grandparent's name and 
will return the names of the grandchidren.Vice versa.Lets assume that there is no name conflict.
 */

import java.util.Scanner;
import java.util.*;

public class GrandparentsExample {
    public static void main(String[] args) {
        // Initialize the arrays
        String[] grandparents = {"John", "Mary", "David", "Lisa"};
        String[] grandchildren = {"Emily", "Samantha", "Tom", "Joe", "Jenny", "Amy", "Harry", "Jack"};
        int[] numGrandchildren = {2, 1, 3, 2}; // Each grandparent has 2, 1, 3, and 2 grandchildren respectively

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a grandparent's name
        System.out.print("Enter a grandparent's name: ");
        String grandparentName = scanner.nextLine();

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
