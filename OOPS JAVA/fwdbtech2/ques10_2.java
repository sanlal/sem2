package b_tech_assignment2;

import java.util.Scanner;

public class ques10_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        char ch = scn.next().charAt(1);

        int count = str.length() - str.replaceAll(Character.toString(ch), "").length();

        System.out.println("The character " + ch + " appears " + count + " times in the string");

    }
}
