import java.io.*;

public class ques6 {
    public static void main(String[] args)throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        System.out.println("enter a number: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        //double res = 0.0;
        for(int i=1;i<=10;i++){
            //System.out.println(fact(i));
            arr[i-1] = n*i;
            System.out.println(n+" * "+i+" = "+arr[i-1]);
           
        }

        
    }
}
