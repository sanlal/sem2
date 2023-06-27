 import java.util.*;

public class HashMapEmptyExample2 {
    public static void main(String args[]) {
      
      // Creating HashMap object with String keys and String values    
      HashMap<String, String> map = new HashMap<>();
      
      // Checking whether HashMap is empty or not using size() method
      System.out.println("Checking Is HashMap empty using size() method?: " + (map.size()==0));
      
      // Putting elements to the HashMap object
      map.put("100", "Java");
      map.put("1000", "Python");
      map.put("10000", "Javascript");
      
      // Checking again whether HashMap is empty or not using size() method
      System.out.println("Checking Is HashMap empty using size() method?: "+ (map.size()==0));
    }
}
