public class StringFunctions {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Length of string
        int length = str.length();
        System.out.println("Length of string: " + length);

        // Concatenate two strings
        String str2 = " How are you?";
        String newStr = str.concat(str2);
        System.out.println("Concatenated string: " + newStr);

        // Extract a substring
        String subStr = str.substring(7, 12);
        System.out.println("Substring: " + subStr);

        // Check if string contains a specific word
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);

        // Check if string starts with a specific word
        boolean startsWith = str.startsWith("He");
        System.out.println("Starts with 'He': " + startsWith);

        // Check if string ends with a specific word
        boolean endsWith = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWith);


        public class StringFunctions {
          public static void main(String[] args) {
              String str = "Hello, World!";
      
              // Length of string
              int length = str.length();
              System.out.println("Length of string: " + length);
      
              // Concatenate two strings
              String str2 = " How are you?";
              String newStr = str.concat(str2);
              System.out.println("Concatenated string: " + newStr);
      
              // Extract a substring
              String subStr = str.substring(7, 12);
              System.out.println("Substring: " + subStr);
      
              // Check if string contains a specific word
              boolean contains = str.contains("World");
              System.out.println("Contains 'World': " + contains);
      
              // Check if string starts with a specific word
              boolean startsWith = str.startsWith("He");
              System.out.println("Starts with 'He': " + startsWith);
      
              // Check if string ends with a specific word
              boolean endsWith = str.endsWith("!");
              System.out.println("Ends with '!': " + endsWith);
      
              // Compare strings
              int compareTo = str.compareTo(str2);
              System.out.println("Comparison result: " + compareTo);
              
              // Check if string is empty
              boolean isEmpty = str.isEmpty();
              System.out.println("Is Empty: " + isEmpty);
              
              // Replace a specific word
              String replaced = str.replace("World", "Java");
              System.out.println("Replace 'World' with 'Java': " + replaced);
              
              // Convert string to upper case
              String upper = str.toUpperCase();
              System.out.println("Upper case: " + upper);
              
              // Convert string to lower case
              String lower = str.toLowerCase();
              System.out.println("Lower case: " + lower);
              
              // Trim leading and trailing spaces
              String trimmed = str2.trim();
              System.out.println("Trimmed: " + trimmed);
              
              // Split string into an array of substrings
              String[] split = str.split(",");
              System.out.println("Split: " + Arrays.toString(split));
            
            
              //str.

          }
      }
      

    }
}
