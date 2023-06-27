package b_tech_assignment2;

import java.util.Scanner;

public class ques14_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        String reversedStr = new String(chars);
        System.out.println(reversedStr);

    }
}
