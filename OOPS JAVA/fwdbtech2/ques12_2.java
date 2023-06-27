package b_tech_assignment2;

import java.util.Scanner;

public class ques12_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();


        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 'a' + 'A');
            }
        }

        String upperCaseStr = new String(charArray);

        System.out.println("Original string: " + str);
        System.out.println("Uppercase string: " + upperCaseStr);

    }
}
