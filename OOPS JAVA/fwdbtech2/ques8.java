package b_tech_assignment2;

public class ques8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 2;
        int[] newArray = new int[array.length - 1];
        
        // Copy the elements of the original array to the new array
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i+1];
            }
        }
        
        // Print the elements of the new array
        System.out.print("New array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
