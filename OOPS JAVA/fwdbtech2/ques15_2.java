package b_tech_assignment2;

import java.util.Scanner;

public class ques15_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String originalStr = scn.nextLine();
        String newStr = scn.nextLine();
        int index = scn.nextInt();

        char[] resultChars = new char[originalStr.length() + newStr.length()];

        for (int i = 0; i < index; i++) {
            resultChars[i] = originalStr.charAt(i);
        }

        for (int i = 0; i < newStr.length(); i++) {
            resultChars[index + i] = newStr.charAt(i);
        }

        for (int i = index; i < originalStr.length(); i++) {
            resultChars[newStr.length() + i] = originalStr.charAt(i);
        }

        String resultStr = new String(resultChars);
        System.out.println(resultStr);

    }
}
