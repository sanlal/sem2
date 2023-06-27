package b_tech_assignment2;

import java.util.Scanner;

public class ques12_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();

        String upperCaseStr = str.toUpperCase();

        System.out.println("Original string: " + str);
        System.out.println("Uppercase string: " + upperCaseStr);

    }
}
