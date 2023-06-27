package b_tech_assignment2;

import java.util.Scanner;

public class ques10_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        char ch = scn.next().charAt(1);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character " + ch + " appears " + count + " times in the string");

    }
}
