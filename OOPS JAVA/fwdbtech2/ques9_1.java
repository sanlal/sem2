package b_tech_assignment2;

import java.util.Scanner;

public class ques9_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        char ch = scn.next().charAt(1);
        int index = str.indexOf(ch);
        if (index != -1) {
            System.out.println("The character " + ch + " is found at index " + index);
        } else {
            System.out.println("The character " + ch + " is not found");
        }

    }
}
