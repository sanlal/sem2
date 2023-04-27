/*Q6 Write a Method rotate( ) which takes an input string and integer d 
and shifts all characterin the input string towards right by d elements. 
For example if input string is “apple” and d=2
then the Method changes the string to “leapp”.
 */
public class StringRotation {
    public static void main(String[] args) {
        String input = "apple";
        int d = 2;
        System.out.println(rotate(input, d));
    }

    public static String rotate(String input, int d) {
        String rotated = input.substring(input.length() - d) + 
           input.substring(0, input.length() - d);
        return rotated;
    }
}
