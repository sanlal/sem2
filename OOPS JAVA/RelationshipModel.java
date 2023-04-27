import java.util.*;
import java.io.*;

public class RelationshipModel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the number of grandparents
        System.out.println("Enter the number of grandparents: ");
        int numGrandparents = sc.nextInt();
        sc.nextLine();
        
        // Initialize the arrays
        String[] grandparents = new String[numGrandparents];
        int[] numGrandchildren = new int[numGrandparents];
        int totalGrandchildren = 0;
        for (int i = 0; i < numGrandparents; i++) {
            System.out.println("Enter grandparent #" + (i+1) + " name: ");
            grandparents[i] = sc.nextLine();
            System.out.println("Enter the number of grandchildren for " + grandparents[i] + ": ");
            numGrandchildren[i] = sc.nextInt();
            scanner.nextLine();
            totalGrandchildren += numGrandchildren[i];
        }
        
        String[] grandchildren = new String[totalGrandchildren];
        int childIndex = 0;
        for (int i = 0; i < numGrandparents; i++) {
            for (int j = 0; j < numGrandchildren[i]; j++) {
                System.out.println("Enter grandchild #" + (j+1) + " name for " + grandparents[i] + ": ");
                grandchildren[childIndex] = scanner.nextLine();
                childIndex++;
            }
        }
        
        // Get grandparent or grandchild name from user
        System.out.println("Enter grandparent's name: ");
        String grandparentName = scanner.nextLine();
        
        for (int i = 0; i < grandparents.length; i++) {
            if (grandparents[i].equals(grandparentName)) {
                int startIndex = 0;
                for (int j = 0; j < i; j++) {
                    startIndex += numGrandchildren[j];
                }
                int endIndex = startIndex + numGrandchildren[i];
                for (int k = startIndex; k < endIndex; k++) {
                    System.out.println(grandchildren[k]);
                }
            }
        }
        
        System.out.println("Enter grandchild's name: ");
        String grandchildName = scanner.nextLine();
        
        for (int i = 0; i < grandparents.length; i++) {
            int startIndex = 0;
            for (int j = 0; j < i; j++) {
                startIndex += numGrandchildren[j];
            }
            int endIndex = startIndex + numGrandchildren[i];
            for (int k = startIndex; k < endIndex; k++) {
                if (grandchildren[k].equals(grandchildName)) {
                    System.out.println(grandparents[i]);
                }
            }
        }
    }
}
