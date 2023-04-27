import java.util.Scanner;

public class Q5Relationships {

    public static void main(String[] args) {
        String[] grandparents = {"Grandparent1", "Grandparent2", "Grandparent3"};
        String[] grandchildren = {"Grandchild1", "Grandchild2", "Grandchild3", "Grandchild4", "Grandchild5", "Grandchild6", "Grandchild7"};
        int[] numGrandchildren = {2, 3, 2};
        
        Scanner scanner = new Scanner(System.in);
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
