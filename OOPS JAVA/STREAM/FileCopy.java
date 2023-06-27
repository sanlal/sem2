import java.io.*;

public class FileCopy {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileInputStream fis= new FileInputStream("xyz.txt");
        FileOutputStream fos= new FileOutputStream("bbc.txt");
        int data;
        while((data = fis.read())!= -1){
            fos.write(data);
       // System.out.println("data : "+ data);
         // System.out.print("data : "+ (char)data);
      
        }
        System.out.print("file Copied");
        fis.close();
        fos.close();
    }
}
