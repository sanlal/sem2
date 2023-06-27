import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class Zip {
    public static void name(String args[]) throws IOException 
    {
     FileInputStream fis = new FileInputStream("file1");
     
     FileOutputStream fos = new FileOutputStream("file2");

     DeflaterOutputStream dos = new DeflaterOutputStream(fos);

     int data;
     while((data=fis.read(null))!= -1)
     dos.write(data);

     fis.close();
     dos.close();
    }
}
