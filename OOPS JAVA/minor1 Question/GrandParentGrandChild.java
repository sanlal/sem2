import java.util.Scanner;

public class GrandParentGrandChild {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input grandparent names
        System.out.print("Enter number of grandparents: ");
        int numGrandParents = scanner.nextInt();
        String[] grandParents = new String[numGrandParents];
        for (int i = 0; i < numGrandParents; i++) {
            System.out.print("Enter name of grandparent #" + (i+1) + ": ");
            grandParents[i] = scanner.next();
        }
        
        // Input grandchild names and their corresponding grandparent index
        System.out.print("Enter number of grandchildren: ");
        int numGrandChildren = scanner.nextInt();
        String[] grandChildren = new String[numGrandChildren];
        int[] grandParentIndices = new int[numGrandChildren];
        for (int i = 0; i < numGrandChildren; i++) {
            System.out.print("Enter name of grandchild #" + (i+1) + ": ");
            grandChildren[i] = scanner.next();
            System.out.print("Enter index of grandparent for " + grandChildren[i] + ": ");
            grandParentIndices[i] = scanner.nextInt();
        }


        // Input grandchild names and their corresponding grandparent index
        
        String[] grandParents = new String[numGrandChildren];
        int[] grandParentIndices = new int[numGrandChildren];
        for (int i = 0; i < numGrandChildren; i++) {
            System.out.print("Enter name of grandchild #" + (i+1) + ": ");
            grandChildren[i] = scanner.next();
            System.out.print("Enter index of grandparent for " + grandChildren[i] + ": ");
            grandParentIndices[i] = scanner.nextInt();
        }
        
        // Print the grandchildren for a given grandparent
        System.out.print("Enter grandparent name to find their grandchildren: ");
        String grandParentName = scanner.next();
        for (int i = 0; i < numGrandParents; i++) {
            if (grandParents[i].equals(grandParentName)) {
                System.out.println("Grandchildren of " + grandParentName + ":");
                for (int j = 0; j < numGrandChildren; j++) {
                    if (grandParentIndices[j] == i) {
                        System.out.println(grandChildren[j]);
                    }
                }
                return;
            }
        }
        System.out.println("Grandparent " + grandParentName + " not found.");


        //Print the grandparent for a given grandchild
        System.out.print("Enter grandparent name to find their grandchildren: ");
        String grandChildName = scanner.next();
        for (int i = 0; i < numGrandChildren; i++) {
            if (grandParents[i].equals(grandChildName)) {
                System.out.println("Grandchildren of " + grandChildName + ":");
                for (int j = 0; j < numGrandParents; j++) {
                    if (grandChildrenIndices[j] == i) {
                        System.out.println(grandParents[j]);
                    }
                }
                return;
            }
        }
        System.out.println("Grandparent " + grandChildName + " not found.");
    }

}
