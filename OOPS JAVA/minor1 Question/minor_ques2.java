import java.io.*;
import java.util.*;

class minor_ques2{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner br= new Scanner(System.in);
        //int size = br.nextInt();
        System.out.println("Enter size of grandparent: ");
        int size = Integer.parseInt(br.readLine());
        String[] GP = new String[size];
        
        for(int i=0;i<size;i++){
            String temp = br.readLine();
            GP[i] = temp;
        }

        System.out.println("Enter number of grand children array size: ");
        int size_gcn = Integer.parseInt(br.readLine());
        int[] GC = new int[size_gcn];
        
        for(int i=0;i<size_gcn;i++){
            int temp = Integer.parseInt(br.readLine());
            GC[i] = temp;
        }

        System.out.println("Enter size of grand children: ");
        int size_gc = Integer.parseInt(br.readLine());
        String[] g_c = new String[size_gc];
        
        for(int i=0;i<size_gc;i++){
            String temp = br.readLine();
            g_c[i] = temp;
        }

        HashMap<String,ArrayList<String>> GP_map = new HashMap<>();
        HashMap<String,ArrayList<String>> g_c_map = new HashMap<>();

        int index_num = 0;
        for(int i=0;i<size;i++){
            int curr_n = GC[i];
            if(GP_map.containsKey(GP[i])){
                ArrayList<String> temp = GP_map.get(GP[i]);
                for(int j=0;j<curr_n;j++){
                    temp.add(g_c[index_num]);
                    index_num++;
                }
                GP_map.put(GP[i],temp);
            }else{
                ArrayList<String> temp = new ArrayList<>();
                for(int j=0;j<curr_n;j++){
                    temp.add(g_c[index_num]);
                    index_num++;
                }
                GP_map.put(GP[i],temp);
            }
        }



        index_num = 1;
        int index_gp = 0;
        int sum = 0;
        for(int i=0;i<size;i++){
        
            int curr_n = GC[i];
            sum = sum+curr_n;
            // curr_n = index_num+curr_n;
            // index_num = curr_n;
            if(g_c_map.containsKey(g_c[sum-1])){
                ArrayList<String> temp = g_c_map.get(GP[sum-1]);
                // for(int j=0;j<curr_n;j++){
                //     temp.add(g_c[index_num]);
                //     index_num++;
                // }
                temp.add(GP[index_gp]);
                index_gp++;
                g_c_map.put(g_c[sum-1],temp);
            }else{
                ArrayList<String> temp = new ArrayList<>();
                // for(int j=0;j<curr_n;j++){
                //     temp.add(g_c[index_num]);
                //     index_num++;
                // }
                temp.add(GP[index_gp]);
                index_gp++;
                g_c_map.put(g_c[sum-1],temp);
            }
        }

        
        boolean flag = true;

        while(flag){
            System.out.println("enter 0 for grand parent name or 1 for grand children name: ");
            int choice =    Integer.parseInt(br.readLine());
            switch(choice){
                case 0:
                    System.out.println("enter grand parent name: ");
                    String s_name = br.readLine();
                    System.out.println(GP_map.get(s_name));
                    break;
                case 1:
                    System.out.println("enter grand children name: ");
                    String s_name1 = br.readLine();
                    System.out.println(g_c_map.get(s_name1));
                    break;    
                default:
                    break;    
            }
        }    

        // String s_name = br.readLine();

        // System.out.println(GP_map.get(s_name));
    }
}
