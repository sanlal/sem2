import java.io.*;
public class FOSDemo{
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileInputStream fis= new FileInputStream("bbc.txt");
        int data;
        while((data=fis.read())!=-1){
            System.out.print((char)data);
        }
        System.out.println();
        fis.close();
    }
}