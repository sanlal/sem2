package b_tech_assignment2;

import java.util.Scanner;

public class ques11_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        char oldChar = scn.next().charAt(1);
        char newChar = scn.next().charAt(1);

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == oldChar) {
                charArray[i] = newChar;
            }
        }

        String newStr = new String(charArray);

        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);

    }
}
