//Question 25
/*Accepting a float number from the keyboard
*/
import java.io.IOException;
//import java.lang.*;
//import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Accept{
      public static void main(String args[])throws IOException
       {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an int value: ");
        int num= Integer.parseInt(br.readLine());
        System.out.println("You entered: "+ num);

        //byte n= Byte.parseByte(br.readLine());
        //System.out.println("You entered: "+ n);

       // boolean numb= Boolean.parseBoolean(br.readLine());
        //System.out.println("You entered: "+ numb);
       }
}
