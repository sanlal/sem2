package b_tech_assignment2;

import java.util.Scanner;

public class ques16_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String originalStr = scn.nextLine();
        int startIndex = scn.nextInt();
        int endIndex = scn.nextInt();

        char[] resultChars = new char[originalStr.length() - (endIndex - startIndex)];

        for (int i = 0; i < startIndex; i++) {
            resultChars[i] = originalStr.charAt(i);
        }

        for (int i = endIndex; i < originalStr.length(); i++) {
            resultChars[startIndex + i - endIndex] = originalStr.charAt(i);
        }

        String resultStr = new String(resultChars);
        System.out.println(resultStr);

    }
}
