import java.io.*;

public class FISDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileInputStream fis= new FileInputStream("xyz.txt");
        int data;
        while((data = fis.read())!= -1){
       // System.out.println("data : "+ data);
         // System.out.print("data : "+ (char)data);
         System.out.print((char)data);
        }
        fis.close();
    }
}
