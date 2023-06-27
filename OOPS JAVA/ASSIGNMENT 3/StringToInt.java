/*Q4 4)	Write a JAVA program to extract numeric characters from a given
 string and display the integer sum of all the numeric character’s integral value.
  */

import java.io.*;
class StringToInt {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numeric character: ");
        String s=(br.readLine());
        System.out.println(stoi(s));
    }
    public static int stoi(String s) {
        int i=0;
        int num=0;
        int sum=0;
        while(i<s.length())
        {
            char c=s.charAt(i);
            int x=(int)(c-'0');
            num=num*10+x;
            sum+=x;
            i++;
        }
        
        return sum;
        
    }
}
