package b_tech_assignment2;

import java.util.Scanner;
import java.util.*;

public class ques17_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        String[] arr = new String[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
        }

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }

    }
}
