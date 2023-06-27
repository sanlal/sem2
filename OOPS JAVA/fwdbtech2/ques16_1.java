package b_tech_assignment2;

import java.util.Scanner;

public class ques16_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String originalStr = scn.nextLine();
        int startIndex = scn.nextInt();
        int endIndex = scn.nextInt();

        String resultStr = originalStr.substring(0, startIndex) + originalStr.substring(endIndex);
        System.out.println(resultStr);

    }
}
