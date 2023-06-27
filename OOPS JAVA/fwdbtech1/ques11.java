import java.io.*;
public class ques11 {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args)throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        System.out.println("enter a number: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("factorial is: "+fact(n));
    }
}
