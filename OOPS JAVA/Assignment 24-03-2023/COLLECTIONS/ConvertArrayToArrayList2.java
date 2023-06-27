
import java.util.*;
public class ConvertArrayToArrayList2 {
    public static void main(String args[]) {
      // Creating and initializing Array
      String[] strArray = {"AAA", "BBB", "CCC", "DDD"};
      
      // Declaring ArrayList
      ArrayList<String> al = new ArrayList<>();

      //Converting Array to ArrayList using addAll() method
      Collections.addAll(al, strArray);
      
      // Add more elements to the converted list
      al.add("YYY");
      al.add("ZZZ");
      
      // Displaying arraylist elements using for-each loop
      for(String s : al) {
        System.out.println(s);      
      }
    }
}
