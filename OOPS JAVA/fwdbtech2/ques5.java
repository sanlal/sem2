package b_tech_assignment2;

public class ques5 {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        
        // Copy the contents of the source array to the destination array
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        
        // Print the contents of the destination array
        System.out.print("Destination array: ");
        for (int i = 0; i < destinationArray.length; i++) {
            System.out.print(destinationArray[i] + " ");
        }
    }
}
