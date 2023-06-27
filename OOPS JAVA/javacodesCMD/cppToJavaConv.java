import java.io.*;
import java.util.*;

public class cppToJavaConv {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cppCode = "";
        String line;
        int num = 9;
        while (num>=0) {
            line = br.readLine();
           // System.out.println("Line Added " + line);
            cppCode += line + "\n";
            num = num-1;
        }
        
        cppCode = cppCode.replaceAll("int main()", "public static void main(String[] args) throws IOException");

        cppCode = cppCode.replaceAll("string $", "String $");

        cppCode = cppCode.replaceAll("cin>>", "System.in.readLine($)");

        cppCode = cppCode.replaceAll("cout<<", "System.out.print($)");
        
        
        
        cppCode = cppCode.replaceAll("char\\s*\\[.*?\\]", "String");
        
        cppCode = "public class ConvertedCode {\n" +cppCode +"}\n";
        System.out.print(cppCode);
    }
}

