/* Q1 b) Wrtie a C function which takes string as input and reverse it, without using string
predefined functions. e.g. “ABCDE” o/p: “EDCBA”
 */

import java.util.Scanner;

class strReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        System.out.println(" My Original String is : " + s);
        System.out.println("The Reversed String is : " + reverse(s));

    }

    public static String reverse(String s) {
        int i = 0, j = s.length() - 1;
        char c[] = s.toCharArray();
        while (i < j) {
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;

        }
        String str = new String(c);
        return str;

    }
}
