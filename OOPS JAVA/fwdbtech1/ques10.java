import java.io.*;

public class ques10 {
    public static void main(String[] args)throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        System.out.println("enter a number: ");
        int n = Integer.parseInt(br.readLine());
        for(int i = 1;i<=n;i++){
            int temp = i;
            System.out.print(0+" ");
            for(int j=1;j<=i;j++){
                System.out.print(temp*j+" ");
            }
            System.out.println();
        }
    }
}
