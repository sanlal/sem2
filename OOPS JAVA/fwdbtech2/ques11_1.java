package b_tech_assignment2;

import java.util.Scanner;

public class ques11_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        char oldChar = scn.next().charAt(1);
        char newChar = scn.next().charAt(1);

        String newStr = str.replaceAll(Character.toString(oldChar), Character.toString(newChar));

        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);

    }
}
