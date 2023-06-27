
import java.io.*;

public class Xyz{
    public static void main(String args[]) throws IOException{
        DataInputStream d = new DataInputStream(System.in);
        try (FileOutputStream Fout = new FileOutputStream("xyz.mmc",true)) 
        //BufferedOutputStream bout= new BufferedOutputStream(Fout)
        
        {
            char ch;
            ch=(char)d.read();
            while(ch!='a'){
                Fout.write(ch);
            }
            Fout.close();
        }
    }
}