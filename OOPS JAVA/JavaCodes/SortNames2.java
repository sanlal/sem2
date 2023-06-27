import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class SortNames2 {
    public static void main(String[] args) {
        String[] names = {"John", "Mike", "Sarah", "Jessica", "Daniel"};
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}
