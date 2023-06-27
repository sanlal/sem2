package b_tech_assignment2;

public class ques7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int newElement = 6;
        int index = 2;
        int[] newArray = new int[array.length + 1];
        
        // Copy the elements of the original array to the new array
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i+1] = array[i];
            }
        }
        
        // Insert the new element into the new array
        newArray[index] = newElement;
        
        // Print the elements of the new array
        System.out.print("New array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
