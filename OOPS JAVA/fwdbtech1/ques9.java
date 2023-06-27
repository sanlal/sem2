import java.io.*;

public class ques9 {
    public static void main(String[] args)throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        System.out.println("enter a number: ");
        int n = Integer.parseInt(br.readLine());
        int i = 1;
        int n_l = 1;
        while(i<=n){
            for(int j=1;j<=n_l;j++){
                if(i<=n){
                    System.out.print(i+" ");
                    i++;
                }else{
                    break;
                }
                
            }
            n_l++;
            System.out.println();
        }
    }
}
