
import java.util.Arrays;

public class deleteInsert {

    public static void main(String[] args) {
        try {
            int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

            System.out.println("Original Array : " + Arrays.toString(my_array));

            // Remove the second element (index->1, value->14) of the array
            int removeIndex = 2;

            for (int i = removeIndex; i < my_array.length - 1; i++) {
                my_array[i] = my_array[i + 1];
            }
            System.out.println("After deleting : " + Arrays.toString(my_array));



            //insertion
            int Index_position = 2;
            int newValue    = 5;
            
           for(int i=my_array.length-1; i > Index_position; i--){
             my_array[i] = my_array[i-1];
            }
            my_array[Index_position] = newValue;
            System.out.println("After Inserting : "+Arrays.toString(my_array));



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong.");
        }
        

    }
}