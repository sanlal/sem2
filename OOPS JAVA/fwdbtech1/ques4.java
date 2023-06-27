import java.io.*;
public class ques4 {

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
        double res = 0.0;
        for(int i=1;i<=n;i++){
            //System.out.println(fact(i));
            double temp = 1.0/fact(i);
            System.out.println(temp);
            res = res + temp;
        }

        System.out.println(res);
        
    }
}
