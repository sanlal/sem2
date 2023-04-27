

import java.io.*;
//import java.util.*;

class minor_ques1{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner br = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = Integer.parseInt(br.readLine());
        //int size = br.nextInt();

        int[] arr = new int[size];
        
        for(int i=0;i<size;i++){
            int temp = Integer.parseInt(br.readLine());
            //int temp = br.nextInt();

            arr[i] = temp;
        }
        
        int i=0;
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        while(i<size-1){
            if(min>Math.abs(arr[i]-arr[i+1])){
                min = Math.abs(arr[i]-arr[i+1]);
                min_index = i;
            }
            i=i+1;
        }
        System.out.println("index is: "+min_index);
        
    }
}