//Question 26
/*Accepting a float number from the keyboard
*/
import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.*;
class accept{
      public static void main(String args[])
      throws IOException
       {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an int value: ");
        double num= Double.parseDouble(br.readLine());
        System.out.println("You entered: "+ num);

        byte n = Byte.parseByte(br.readLine());
        System.out.println("You entered: "+ n);

        long numb= Long.parseLong(br.readLine());
        System.out.println("You entered: "+ numb);

        boolean number= Boolean.parseBoolean(br.readLine());
        System.out.println("You entered: "+ number);
       }
}