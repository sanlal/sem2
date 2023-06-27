import java.io.*;
public class ques3 {

    public static boolean isprime(int n){
        for(int i =2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        System.out.println("enter a number: ");
        int a = Integer.parseInt(br.readLine());
        for(int i=2;i<=a;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
        
    }
}
