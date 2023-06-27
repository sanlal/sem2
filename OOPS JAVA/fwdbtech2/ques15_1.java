package b_tech_assignment2;

import java.util.Scanner;

public class ques15_1 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);


        String originalStr = scn.nextLine();
        String newStr = scn.nextLine();
        int index = scn.nextInt();

        String resultStr = originalStr.substring(0, index) + newStr + originalStr.substring(index);
        System.out.println(resultStr);

    }
}
