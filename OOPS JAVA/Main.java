/*Java Program to reverse a string using Recursive Function*/
import java.util.Scanner;
public class Main
{
    //Recursive function that reverses a string
    static void reverse(String str) 
    { 
        //If the string is null or consists of single character
        //then print the entered string 
        if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); 
        else
        { 
            //If string consists of multiple strings
            System.out.print(str.charAt(str.length()-1)); 
            //Call the function recursively to reverse the string
            reverse(str.substring(0,str.length()-1)); 
        }         
    }   
    // Driver Code 
    public static void main(String args[]) 
    { 
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();   //Input the string
        //Call a recursive function to reverse the string
        System.out.println("The reverse of the entered the String :");
        reverse(str); 
    }     
}