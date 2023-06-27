//Question 25
/*Accepting a float number from the keyboard
*/
import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.*;
class Accept{
      public static void main(String args[])throws IOException
       {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an int value: ");
        float num= Float.parseFloat(br.readLine());
        System.out.println("You entered: "+ num);
       }
}
