package b_tech_assignment2;

import java.util.Scanner;

public class ques13_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String str = scn.nextLine();
        String substr = scn.nextLine();

        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            boolean found = true;
            for (int j = 0; j < substr.length(); j++) {
                if (str.charAt(i+j) != substr.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        System.out.println("Original string: " + str);
        System.out.println("Substring: " + substr);
        System.out.println("First index: " + firstIndex);
        System.out.println("Last index: " + lastIndex);

    }
}
