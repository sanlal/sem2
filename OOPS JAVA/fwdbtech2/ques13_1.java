package b_tech_assignment2;

import java.util.Scanner;

public class ques13_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        String substr = scn.nextLine();


        int firstIndex = str.indexOf(substr);
        int lastIndex = str.lastIndexOf(substr);

        System.out.println("Original string: " + str);
        System.out.println("Substring: " + substr);
        System.out.println("First index: " + firstIndex);
        System.out.println("Last index: " + lastIndex);

    }
}
