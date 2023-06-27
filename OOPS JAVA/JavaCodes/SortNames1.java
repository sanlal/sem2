import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class SortNames1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mike", "Sarah", "Jessica", "Daniel");
        Collections.sort(names);
        System.out.println("Sorted names: " + names);
    }
}
