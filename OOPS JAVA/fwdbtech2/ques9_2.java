package b_tech_assignment2;

import java.util.Scanner;

public class ques9_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        char ch = scn.next().charAt(1);

        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The character " + ch + " is found in the string");
        } else {
            System.out.println("The character " + ch + " is not found in the string");
        }

    }
}
