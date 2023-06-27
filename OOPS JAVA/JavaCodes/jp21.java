//Question 22
/*To accept and display a character from the keyboard
*/
import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.*;class Accept{
      public static void main(String args[])throws IOException
       {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a character: ");
        char ch= (char)br.read();
        System.out.println("You entered: "+ ch);
       }
}