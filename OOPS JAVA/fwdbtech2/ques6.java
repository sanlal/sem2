package b_tech_assignment2;

public class ques6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = new int[array1.length + array2.length];
        
        // Copy the elements of array1 to the merged array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        
        // Copy the elements of array2 to the merged array
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        
        // Print the elements of the merged array
        System.out.print("Merged array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
