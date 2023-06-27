package b_tech_assignment2;

import java.util.Scanner;

public class ques14_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedStr = sb.toString();
        System.out.println(reversedStr);

    }
}
