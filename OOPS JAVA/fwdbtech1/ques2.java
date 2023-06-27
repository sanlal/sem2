public class ques2 {
    public static void main(String[] args){
        int prev1 = 0;
        int prev = 1;
        System.out.println(prev1);
        System.out.println(prev);
        for(int i = 0;i<8;i++){
            int temp = prev+prev1;
            System.out.println(temp);
            prev1 = prev;
            prev = temp;

        }
    }
}
