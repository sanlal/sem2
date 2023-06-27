import java.io.*;

public class FOSDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileOutputStream fos= new FileOutputStream("bbc.txt");
    
        fos.write(5);
        
         System.out.print("data is saved");
        
        fos.close();
    }
}
