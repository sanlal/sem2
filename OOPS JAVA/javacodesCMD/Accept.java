//Question 25
/*Accepting a float number from the keyboard
*/
import java.io.*;
class Accept{
      public static void main(String args[])throws IOException
       {
        BufferredReader br= new BufferredReader(new InputStreamReader(System.in));
        System.out.print("Enter an int value: ");
        double num= Double.parseDouble(br.readLine());
        System.out.println("You entered: "+ num);

        byte n= Byte.parseByte(br.readLine());
        System.out.println("You entered: "+ n);

        long num= Long.parseLong(br.readLine());
        System.out.println("You entered: "+ num);

        boolean num= Boolean.parseBoolean(br.readLine());
        System.out.println("You entered: "+ num);
       }
}