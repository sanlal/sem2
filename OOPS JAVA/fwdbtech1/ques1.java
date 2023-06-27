import java.io.*;

public class ques1{
    public static void main(String[] args) throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        int a;
        int b;
        int c;
        System.out.println("Enter three numbers: ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        int[] arr = {a,b,c};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<3;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }


        System.out.println("Biggest number is: "+max);
    }
}